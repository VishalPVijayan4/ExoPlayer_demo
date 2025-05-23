# 🎬 ExoPlayer Sample App

A sample Android project demonstrating how to use [ExoPlayer](https://exoplayer.dev/) to stream videos from a JSON data source. The project focuses purely on the functionality of ExoPlayer, mimicking apps like **YouTube**, **JioCinema**, and **Netflix**, and includes modern Android features such as **Picture-in-Picture (PiP)** and **Search**.

---

## 🚀 Features

- 📃 **Video List Screen**  
  - Loads video data from a static JSON list.  
  - Displays thumbnails, titles, durations, and author details.  
  - Click to navigate to video detail screen.

- 🎥 **Video Playback Screen**  
  - Uses ExoPlayer for smooth video playback.  
  - Supports full-screen landscape orientation.  
  - UI automatically hides system bars in full-screen mode.  

- 🪟 **Picture-in-Picture (PiP) Mode**  
  - Continues video playback in a floating mini-window when the user leaves the app (Android 8.0+).  
  - Seamless experience similar to YouTube and other streaming platforms.  

- 🔍 **Search Functionality**  
  - Built-in search bar on the video list screen.  
  - Filter videos by title instantly.

---

## 🛠️ Tech Stack & Libraries

| Component            | Library / API Used                                      |
|---------------------|----------------------------------------------------------|
| Video Player        | [ExoPlayer](https://github.com/google/ExoPlayer)         |
| JSON Parsing        | [Gson](https://github.com/google/gson)                   |
| Image Loading       | [Glide](https://github.com/bumptech/glide)               |
| UI Layout           | ConstraintLayout, Material Components                    |
| View Binding        | Android ViewBinding                                      |
| Orientation Control | `android:screenOrientation` and `ActivityInfo` APIs      |
| PiP Support         | `PictureInPictureParams` (Android 8.0+)                  |
| Min SDK             | `minSdkVersion 21`                                       |

---

## 📂 Project Structure
ExoPlayerSample/
│
├── data/
│ └── VideoModel.kt # Data class for video JSON entries
│
├── ui/
│ ├── MainActivity.kt # Displays video list with search
│ └── VideoPlayerActivity.kt # Plays selected video with ExoPlayer and PiP
│
├── adapter/
│ └── VideoAdapter.kt # RecyclerView adapter for video list
│
├── res/
│ ├── layout/
│ │ ├── activity_main.xml
│ │ └── activity_video_player.xml
│ ├── drawable/
│ └── values/
│ └── styles.xml
│
├── utils/
│ └── DummyVideoData.kt # Contains static video JSON list

🧪 Testing Tips
Try clicking the Home button while video is playing to test PiP.

Use the search bar to filter the video list in real-time.

Rotate the device or use landscape mode for full-screen playback.

📄 License
This project is licensed under the MIT License. See the LICENSE file for details.

🙌 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss improvements or new features.

