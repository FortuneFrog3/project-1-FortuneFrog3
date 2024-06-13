package com.example.musictriviagame

data class Question(
    val textResId: Int,
    val answerId: Int,
    val choiceIds: List<Int>
)