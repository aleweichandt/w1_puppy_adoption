package com.example.androiddevchallenge.ui.screen.list

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.ui.context.LocalPuppiesRepository
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.view.PuppiesList

@Composable
fun PuppiesListScreen(onPuppySelected: (uuid: String) -> Unit) {
    val repository = LocalPuppiesRepository.current
    val puppies = repository.getAll()
    MyTheme {
        Scaffold(
            topBar = { PuppiesListScreenBar() },
        ) {
            PuppiesListScreenBody(puppies = puppies, onPuppySelected = onPuppySelected)
        }
    }
}

@Composable
fun PuppiesListScreenBar() {
    TopAppBar(title = { Text(text = stringResource(id = R.string.puppies_list_screen_title)) })
}

@Composable
fun PuppiesListScreenBody(puppies: List<Puppy>, onPuppySelected: (uuid: String) -> Unit) {
    Surface {
        PuppiesList(puppies = puppies, onPuppySelected = onPuppySelected)
    }
}

@Preview
@Composable
fun PuppiesListScreenBodyWithPuppies() {
    val puppies = listOf(
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
    )
    PuppiesList(puppies = puppies, onPuppySelected = { })
}
