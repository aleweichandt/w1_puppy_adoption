package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PuppyListItem(puppy: Puppy?, onPuppySelected: (uuid: String) -> Unit) {
    MyTheme {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            puppy?.run {
                val breed = stringResource(id = R.string.puppy_description_line_1, puppy.breed)
                val age = stringResource(id = R.string.puppy_description_line_2, puppy.age)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(Alignment.CenterVertically)
                        .padding(8.dp)
                ) {
                    PuppyImage(
                        puppy = puppy,
                        modifier = Modifier.size(70.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(start = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1.5f)
                                .padding(start = 8.dp)
                                .wrapContentSize(Alignment.CenterStart)
                        ) {
                            Text(text = puppy.name, style = typography.body1)
                            Text(text = breed, style = typography.caption)
                            Text(text = age, style = typography.caption)
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .wrapContentSize(Alignment.CenterEnd)
                        ) {
                            Button(
                                onClick = { onPuppySelected(puppy.uuid) },
                            ) {
                                Text(
                                    text = stringResource(id = R.string.adopt_me),
                                    style = typography.button
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(heightDp = 70)
@Composable
fun ItemWithPuppy() {
    val puppy = Puppy(
        "Lassie",
        2,
        10.0f,
        "Beagle",
        "The dog you always wanted to have",
        "https://images.dog.ceo/breeds/hound-ibizan/n02091244_25.jpg"
    )
    PuppyListItem(puppy = puppy, onPuppySelected = { })
}
