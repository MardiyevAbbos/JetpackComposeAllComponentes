package com.example.uzbvalyuta.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Lesson02Columns(){
    Column(
        modifier = Modifier
            //.fillMaxSize(0.5f)
            .fillMaxWidth(0.6f)
            .fillMaxHeight(0.7f)
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
    }

}

@Composable
fun Lesson02Rows(){
    Row(
        modifier = Modifier
            .width(300.dp)
            .height(600.dp)
            .background(Color.Blue),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
    }

}