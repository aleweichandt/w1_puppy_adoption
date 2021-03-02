/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.domain

import com.example.androiddevchallenge.domain.model.Puppy

class PuppiesRepository() {
    private val puppies = listOf(
    Puppy(
        "Lassie",
        2,
        10.0f,
        "Collie",
        "Lassie, a female Rough Collie, was the star of books, a TV series, several movies, and even a radio show. Lassie belonged to the Martin family, frequently spending time with (and saving the life of) young Timmy Martin, who never actually fell in a well.",
        "https://images.dog.ceo/breeds/collie/n02106030_4592.jpg"
    ),
        Puppy(
            "Ren",
            2,
            10.0f,
            "Chihuahua",
            "Ren Höek is a scrawny \"asthma-hound\" Chihuahua with cream fur, a floppy body, donkey-like ears, neon-pink eyes with dark red pupils, red (or sometimes light brown) eyelids, and a fairly long, rat-like, pink tail",
            "https://images.dog.ceo/breeds/chihuahua/n02085620_8578.jpg"
        ),
        Puppy(
            "Snoopy",
            2,
            10.0f,
            "Beagle",
            "Snoopy made his debut in 1950 and quickly became one of the most beloved characters in the Charlie Brown world. A beagle, he's described on the Peanuts website as \"the hip dog we'd all like to be.\" Also of note from Snoopy's profile, he apparently reads \"War and Peace\" at the rate of one word a day.",
            "https://images.dog.ceo/breeds/beagle/n02088364_18404.jpg"
        ),
        Puppy(
            "Pluto",
            2,
            10.0f,
            "Blood Hound",
            "Pluto is a cartoon character created in 1930 at Walt Disney Pictures. He is a yellow-orange color, medium-sized, short-haired dog with black ears. Unlike most Disney characters, Pluto is not anthropomorphic beyond some characteristics such as facial expression.",
            "https://images.dog.ceo/breeds/hound-blood/n02088466_8515.jpg"
        ),
        Puppy(
            "Droopy",
            2,
            10.0f,
            "Basset Hound",
            "He is an anthropomorphic dog with a droopy face who moves slowly and lethargically and speaks in a jowly monotone voice, and—though hardly an imposing character—is shrewd enough to outwit his enemies",
            "https://images.dog.ceo/breeds/hound-basset/n02088238_6035.jpg"
        ),
        Puppy(
            "Oddie",
            2,
            10.0f,
            "Dachshund",
            "Odie is a yellow-furred, brown-eared dog. In the live-action/animated films based on the Garfield franchise, he is depicted as a wire-haired dachshund/terrier mix. He has a large tongue and slobbers in his appearances.",
            "https://images.dog.ceo/breeds/dachshund/Dash_Dachshund_With_Hat.jpg"
        ),
        Puppy(
            "Scooby",
            2,
            10.0f,
            "Great Danes",
            "Scooby Doo, the cowardly Great Dane who helped the “Scooby Gang” solve supernatural mysteries, has starred in a TV cartoon series as well as a live action film. ",
            "https://images.dog.ceo/breeds/dane-great/n02109047_34022.jpg"
        ),
        Puppy(
            "Marley",
            2,
            10.0f,
            "White Labrador",
            "Marley, the rambunctious puppy of John and Jennifer Grogan in the movie Marley and Me, ends up growing into a 100-pound dog who insists on still acting like a puppy. The adventurous dog becomes the muse behind his owners' newspaper column.",
            "https://images.dog.ceo/breeds/labrador/lab_portrait.JPG"
        ),
        Puppy(
            "Brian",
            2,
            10.0f,
            "White Labrador",
            "Plenty of dogs on TV can talk, but few are as eloquent and intelligent as Brian Griffin. College educated (although he never actually graduated) and very cultured, Brian is smarter than most of the human members of his family. He's also a bit of a player, having dated multiple human women throughout the show.",
            "https://images.dog.ceo/breeds/labrador/n02099712_4323.jpg"
        ),
        Puppy(
            "Astro",
            2,
            10.0f,
            "Great Dane",
            "The dog of the future, Astro from The Jetsons can understand and speak English, although he inserts a lot of extra r's where they aren't supposed to be. Astro wasn't the bravest of dogs, but he did prove that canine companionship will be just as necessary in the future as it is today.",
            "https://images.dog.ceo/breeds/dane-great/n02109047_16735.jpg"
        ),
    )

    fun getAll(): List<Puppy> = puppies
    fun getById(uuid: String): Puppy? = puppies.find { it.uuid == uuid }
}
