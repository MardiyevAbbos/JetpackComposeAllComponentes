package com.example.uzbvalyuta.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ModifierPart1(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxHeight(0.6f)
            //.requiredWidth(600.dp)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            //.padding(top = 20.dp, start = 16.dp)
            .padding(10.dp)
            .border(5.dp, Color.Blue)
            .padding(10.dp)
            .border(5.dp, Color.Cyan)
            .padding(10.dp)
    ) {
        Text(text = "Hello", modifier = Modifier.clickable {

        }
            //.scrollable()
            //.draggable()
            /*, modifier = Modifier
            .offset(20.dp, 20.dp)
            .border(5.dp, Color.Yellow)
            .padding(10.dp)
            .offset(20.dp, 20.dp)
            .border(5.dp, Color.Black)
            .padding(10.dp)*/
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World")
    }
}