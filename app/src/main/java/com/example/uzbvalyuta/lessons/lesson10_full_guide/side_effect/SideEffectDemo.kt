package com.example.uzbvalyuta.lessons.lesson10_full_guide.side_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo(nonComposeCounter: Int) {
    SideEffect {
        println("Called after every successful recomposition")
    }
}