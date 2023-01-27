package com.example.uzbvalyuta.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.uzbvalyuta.lessons.Lesson15MakeTimer
import com.example.uzbvalyuta.lessons.Lesson16AnimatedDropDown
import com.example.uzbvalyuta.lessons.RunMusicPlayer
import com.example.uzbvalyuta.lessons.lesson14_meditation_ui.ui.HomeScreen
import com.example.uzbvalyuta.lessons.lesson14_meditation_ui.ui.theme.MeditationUIYouTubeTheme
import com.example.uzbvalyuta.lessons.lesson17_insta_profil_ui.ProfileScreen
import com.example.uzbvalyuta.lessons.lesson18_navigation_beginners.Navigation

class Lessons14Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Navigation()
        }

    }
}

