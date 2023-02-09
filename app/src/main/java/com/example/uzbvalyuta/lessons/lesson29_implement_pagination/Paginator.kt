package com.example.uzbvalyuta.lessons.lesson29_implement_pagination

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}