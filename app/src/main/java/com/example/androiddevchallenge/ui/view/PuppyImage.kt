package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.domain.model.Puppy

@Composable
fun PuppyImage(puppy: Puppy, modifier: Modifier) {
    Box(modifier = modifier) {
        // GlideImage(
        //     data = puppy.imageUri,
        //     contentDescription = stringResource(id = R.string.puppy_image, puppy.name),
        //     loading = {
        //         Box(Modifier.matchParentSize()) {
        //             CircularProgressIndicator(Modifier.align(Alignment.Center))
        //         }
        //     },
        //     requestBuilder = {
        //         val options = RequestOptions()
        //         options.centerCrop()
        //         apply(options)
        //     },
        //     error = {
        //         Box(Modifier.matchParentSize()) {
        //             Image(
        //                 painter = painterResource(id = R.drawable.ic_error),
        //                 contentDescription = stringResource(id = R.string.error),
        //             )
        //         }
        //     }
        // )
        Box(Modifier.matchParentSize()) {
            CircularProgressIndicator(Modifier.align(Alignment.Center))
        }
    }
}
