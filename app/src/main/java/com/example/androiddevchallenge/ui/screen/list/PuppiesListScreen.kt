package com.example.androiddevchallenge.ui.screen.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.ui.context.LocalPuppiesRepository
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.view.PuppiesList

@Composable
fun PuppiesListScreen(onPuppySelected: (uuid: String) -> Unit) {
    val repository = LocalPuppiesRepository.current
    val puppies = repository.getAll()
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            PuppiesList(puppies = puppies, onPuppySelected = onPuppySelected)
        }
    }
}
