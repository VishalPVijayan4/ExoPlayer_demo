package com.vishalpvijayan.exoplayer_demo


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class VideoAdapter(private val videos: List<VideoModel>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    inner class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val thumbnail: ImageView = view.findViewById(R.id.thumbnail)
        val title: TextView = view.findViewById(R.id.title)
        val duration: TextView = view.findViewById(R.id.txtDuration)
        val uploadTime: TextView = view.findViewById(R.id.uploadtime)
        val views: TextView = view.findViewById(R.id.txtViews)
        val author: TextView = view.findViewById(R.id.txtAuthor)
        val description: TextView = view.findViewById(R.id.txtDescription)
        val subscriber: TextView = view.findViewById(R.id.txtSubscriber)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val video = videos[position]
        holder.title.text = video.title
        holder.duration.text = video.duration
        holder.uploadTime.text = video.uploadTime
        holder.views.text = video.views
        holder.author.text = video.author
        holder.description.text = video.description
        holder.subscriber.text = video.subscriber

        Picasso.get().load(video.thumbnailUrl).into(holder.thumbnail)
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, VideoPlayerActivity::class.java)
            intent.putExtra("VIDEO_URL", video.videoUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = videos.size
}
