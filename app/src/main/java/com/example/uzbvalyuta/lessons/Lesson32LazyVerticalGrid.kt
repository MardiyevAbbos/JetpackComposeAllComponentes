package com.example.uzbvalyuta.lessons

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Lesson32LazyVerticalGrid() {
    val state = rememberLazyListState(
        initialFirstVisibleItemIndex = 5
    )
    LazyVerticalGrid(
        cells = GridCells.Adaptive(100.dp),
        state = state,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        content = {
            items(100){ i->
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.Green),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Item $i"
                    )
                }
            }
        }
    )
}