package com.example.androiddevchallenge.domain.model

import java.util.*

data class Puppy(
    val name: String,
    val age: Int,
    val weight: Float,
    val breed: String,
    val resume: String,
    val imageUri: String,
    val uuid: String = UUID.randomUUID().toString(),
)
