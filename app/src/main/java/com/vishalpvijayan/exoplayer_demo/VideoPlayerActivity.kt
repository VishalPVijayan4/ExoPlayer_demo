package com.vishalpvijayan.exoplayer_demo


import android.app.PictureInPictureParams
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.util.Rational
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.StyledPlayerView

class VideoPlayerActivity : AppCompatActivity() {

    private lateinit var player: ExoPlayer
    private lateinit var playerView: StyledPlayerView

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()

        // Optional: Trigger Picture-in-Picture mode here
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val aspectRatio = Rational(16, 9)
            val pipBuilder = PictureInPictureParams.Builder()
                .setAspectRatio(aspectRatio)
            enterPictureInPictureMode(pipBuilder.build())
        }
    }

    override fun onPictureInPictureModeChanged(
        isInPictureInPictureMode: Boolean,
        newConfig: Configuration
    ) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig)

        // Hide or show UI controls
        if (isInPictureInPictureMode) {
            // Hide player controls
            playerView.useController = false
        } else {
            // Show controls when back in full screen
            playerView.useController = true
        }
    }

    override fun onPause() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N || !isInPictureInPictureMode) {
            player?.pause()
        }
        super.onPause()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                )

        // Optional: force landscape orientation (if not already set in manifest)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        playerView = StyledPlayerView(this)
        setContentView(playerView)

        val videoUrl = intent.getStringExtra("VIDEO_URL") ?: return

        player = ExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()


        player.addListener(object : Player.Listener {
            override fun onPlayerError(error: PlaybackException) {
                Log.e("ExoPlayer", "Playback error: ${error.message}", error)
            }
        })


    }




    override fun onStop() {
        super.onStop()
        player.release()
    }
}
