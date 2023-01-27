package com.example.uzbvalyuta.lessons.lesson10_full_guide.produce_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun ProduceStateDemo(countUpTo: Int): State<Int> {
    return produceState(initialValue = 0){
        while (value < countUpTo){
            delay(1000L)
            value++
        }
    }

    /*return flow<Int>{
        var value = 0
        while (value < countUpTo){
            delay(1000L)
            value++
            emit(value)
        }
    }.collectAsState(initial = 0)*/
}