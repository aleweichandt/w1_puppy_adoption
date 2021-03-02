package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppiesList(puppies: List<Puppy>, onPuppySelected: (uuid: String) -> Unit) {
    MyTheme {
        LazyColumn {
            items(puppies) { puppy ->
                PuppyListItem(puppy = puppy, onPuppySelected = onPuppySelected)
            }
        }
    }
}
