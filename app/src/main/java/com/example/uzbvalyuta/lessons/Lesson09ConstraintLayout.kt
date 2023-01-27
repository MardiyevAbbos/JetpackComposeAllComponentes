package com.example.uzbvalyuta.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun CreateConstraintLayout() {

    val constraints = ConstraintSet {
        val greenBox = createRefFor("greenBox")
        val yellowBox = createRefFor("yellowBox")
        val redBox = createRefFor("redBox")
        val guideline = createGuidelineFromTop(0.5f)

        constrain(greenBox) {
            top.linkTo(guideline)
            start.linkTo(parent.start)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }
        constrain(yellowBox) {
            top.linkTo(parent.top)
            start.linkTo(greenBox.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }
        constrain(redBox) {
            top.linkTo(parent.top)
            start.linkTo(yellowBox.end)
            end.linkTo(parent.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }
        createHorizontalChain(greenBox, yellowBox, redBox, chainStyle = ChainStyle.Spread)
    }

    ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .background(Color.Green)
            .layoutId("greenBox")
        )
        Box(modifier = Modifier
            .background(Color.Yellow)
            .layoutId("yellowBox")
        )
        Box(modifier = Modifier
            .background(Color.Red)
            .layoutId("redBox")
        )
    }

}