package com.vishalpvijayan.exoplayer_demo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val videoList = listOf(
            VideoModel(
                id = "1",
                title = "Big Buck Bunny",
                thumbnailUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Big_Buck_Bunny_thumbnail_vlc.png/1200px-Big_Buck_Bunny_thumbnail_vlc.png",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "Vlc Media Player",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                description = "Big Buck Bunny tells the story of a giant rabbit with a heart bigger than himself...",
                subscriber = "25254545 Subscribers",
                isLive = true
            ),
            VideoModel(
                id = "2",
                title = "The first Blender Open Movie from 2006",
                thumbnailUrl = "https://i.ytimg.com/vi_webp/gWw23EYM9VM/maxresdefault.webp",
                duration = "12:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "Blender Inc.",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
                description = "Song : Raja Raja Kareja Mein Samaja\nAlbum : Raja Kareja Mein Samaja\n...",
                subscriber = "25254545 Subscribers",
                isLive = true
            ),
            VideoModel(
                id = "3",
                title = "For Bigger Blazes",
                thumbnailUrl = "https://i.ytimg.com/vi/Dr9C2oswZfA/maxresdefault.jpg",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "T-Series Regional",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
                description = "Song : Raja Raja Kareja Mein Samaja\nAlbum : Raja Kareja Mein Samaja\n...",
                subscriber = "25254545 Subscribers",
                isLive = true
            ),
            VideoModel(
                id = "4",
                title = "For Bigger Escape",
                thumbnailUrl = "https://img.jakpost.net/c/2019/09/03/2019_09_03_78912_1567484272._large.jpg",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "T-Series Regional",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                description = "Introducing Chromecast. The easiest way to enjoy online video and music on your TV...",
                subscriber = "25254545 Subscribers",
                isLive = false
            ),
            VideoModel(
                id = "5",
                title = "Big Buck Bunny",
                thumbnailUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Big_Buck_Bunny_thumbnail_vlc.png/1200px-Big_Buck_Bunny_thumbnail_vlc.png",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "Vlc Media Player",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                description = "Big Buck Bunny tells the story of a giant rabbit with a heart bigger than himself...",
                subscriber = "25254545 Subscribers",
                isLive = true
            ),
            VideoModel(
                id = "6",
                title = "For Bigger Blazes",
                thumbnailUrl = "https://i.ytimg.com/vi/Dr9C2oswZfA/maxresdefault.jpg",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "T-Series Regional",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
                description = "Song : Raja Raja Kareja Mein Samaja\nAlbum : Raja Kareja Mein Samaja\n...",
                subscriber = "25254545 Subscribers",
                isLive = false
            ),
            VideoModel(
                id = "7",
                title = "For Bigger Escape",
                thumbnailUrl = "https://img.jakpost.net/c/2019/09/03/2019_09_03_78912_1567484272._large.jpg",
                duration = "8:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "T-Series Regional",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                description = "Introducing Chromecast. The easiest way to enjoy online video and music on your TV...",
                subscriber = "25254545 Subscribers",
                isLive = true
            ),
            VideoModel(
                id = "8",
                title = "The first Blender Open Movie from 2006",
                thumbnailUrl = "https://i.ytimg.com/vi_webp/gWw23EYM9VM/maxresdefault.webp",
                duration = "12:18",
                uploadTime = "May 9, 2011",
                views = "24,969,123",
                author = "Blender Inc.",
                videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
                description = "Song : Raja Raja Kareja Mein Samaja\nAlbum : Raja Kareja Mein Samaja\n...",
                subscriber = "25254545 Subscribers",
                isLive = false
            )
        )


        recyclerView.adapter = VideoAdapter(videoList)
    }
}