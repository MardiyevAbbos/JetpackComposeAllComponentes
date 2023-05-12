package com.example.uzbvalyuta.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.uzbvalyuta.lessons.*
import com.example.uzbvalyuta.lessons.lesson29_implement_pagination.Lesson29MainScreen
import com.example.uzbvalyuta.lessons.lesson31_create_navigation_drawer.CreateNavigationDrawer
import com.example.uzbvalyuta.ui.theme.UZBValyutaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UZBValyutaTheme {
                Lesson32LazyVerticalGrid()
            }
        }

    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UZBValyutaTheme {
        Greeting("Android")
    }
}