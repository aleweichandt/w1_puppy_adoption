package com.example.androiddevchallenge.domain

import com.example.androiddevchallenge.domain.model.Puppy

class PuppiesRepository() {
    private val puppies = listOf(
        Puppy(
            "Lazzie",
            2,
            10.0f,
            "Beagle",
            "The dog you always wanted to have",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Ren",
            2,
            10.0f,
            "Beagle",
            "Strange dog from cartoon network",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Stimpy",
            2,
            10.0f,
            "Beagle",
            "Weird dog from cartoon network",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Snoopy",
            2,
            10.0f,
            "Beagle",
            "Dreamest dog ever wanted",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Pluto",
            2,
            10.0f,
            "Beagle",
            "Walt Disney's best partner",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Droopy",
            2,
            10.0f,
            "Beagle",
            "Really lazy dog",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Clifford",
            2,
            10.0f,
            "Beagle",
            "No idea who is he",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Oddie",
            2,
            10.0f,
            "Beagle",
            "Loves to jump from tables",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Scooby",
            2,
            10.0f,
            "Beagle",
            "Likes to chase ghosts",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
        Puppy(
            "Brian",
            2,
            10.0f,
            "Beagle",
            "From family guy tv show",
            "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
        ),
    )

    fun getAll(): List<Puppy> = puppies
    fun getById(uuid: String): Puppy? = puppies.find { it.uuid == uuid }
}
