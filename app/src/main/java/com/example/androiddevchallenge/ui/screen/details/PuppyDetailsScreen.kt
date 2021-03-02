package com.example.androiddevchallenge.ui.screen.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.ui.context.LocalPuppiesRepository
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography
import com.example.androiddevchallenge.ui.view.PuppyImage

@Composable
fun PuppyDetailsScreen(uuid: String?, back: () -> Unit) {
    val repository = LocalPuppiesRepository.current
    val puppy = uuid?.let { repository.getById(uuid) }
    MyTheme {
        Scaffold(
            topBar = {
                PuppyDetailsScreenBar(
                    puppy = puppy,
                    back = back
                )
            },
        ) {
            puppy?.run {
                PuppyDetailsScreenBody(puppy = puppy, onAdopt = {
                    back()
                })
            } ?: run {
                Text(text = stringResource(id = R.string.not_found))
            }
        }
    }
}

@Composable
fun PuppyDetailsScreenBar(puppy: Puppy?, back: () -> Unit) {
    TopAppBar(
        title = {
            Text(text = puppy?.name ?: stringResource(id = R.string.not_found))
        },
        navigationIcon = {
            IconButton(onClick = back) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = stringResource(id = R.string.back)
                )
            }
        }
    )
}

@Composable
fun PuppyDetailsScreenBody(puppy: Puppy, onAdopt: () -> Unit) {
    Surface {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Row {
                PuppyImage(
                    puppy = puppy,
                    modifier = Modifier.weight(1f),
                    transformation = CircleCropTransformation()
                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.puppy_description_line_1, puppy.breed),
                        style = typography.body2,
                    )
                    Text(
                        text = stringResource(id = R.string.puppy_description_line_2, puppy.age),
                        style = typography.body2,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.puppy_description_line_3, puppy.weight),
                        style = typography.body2,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.overview),
                    style = typography.h6
                )
                Text(
                    text = puppy.resume,
                    style = typography.body1,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Button(
                onClick = onAdopt,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(Alignment.Bottom)
            ) {
                Text(text = stringResource(id = R.string.adopt_me))
            }
        }
    }
}

@Preview
@Composable
fun PuppyDetailsScreenBodyWithPuppy() {
    val puppy = Puppy(
        "Lazzie",
        2,
        10.0f,
        "Beagle",
        "The dog you always wanted to have",
        "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
    )
    PuppyDetailsScreenBody(puppy = puppy, onAdopt = {})
}
