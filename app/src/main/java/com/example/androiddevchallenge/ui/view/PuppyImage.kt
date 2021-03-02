package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.RoundedCornersTransformation
import coil.transform.Transformation
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.model.Puppy
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyImage(puppy: Puppy, modifier: Modifier, transformation: Transformation? = null) {
    Box(modifier = modifier) {
        CoilImage(
            data = puppy.imageUri,
            contentDescription = stringResource(id = R.string.puppy_image, puppy.name),
            loading = {
                Box(Modifier.matchParentSize()) {
                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                }
            },
            requestBuilder = {
                transformations(transformation ?: RoundedCornersTransformation())
            },
            error = {
                Box(Modifier.matchParentSize()) {
                    Image(
                        modifier = Modifier.align(Alignment.Center),
                        painter = painterResource(id = R.drawable.ic_error),
                        contentDescription = stringResource(id = R.string.not_found),
                    )
                }
            }
        )
    }
}

@Preview
@Composable
fun PuppyImageWithPuppy() {
    val puppy = Puppy(
        "Oddie",
        2,
        10.0f,
        "Beagle",
        "The dog you always wanted to have",
        "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
    )
    PuppyImage(puppy = puppy, modifier = Modifier.size(50.dp))
}
