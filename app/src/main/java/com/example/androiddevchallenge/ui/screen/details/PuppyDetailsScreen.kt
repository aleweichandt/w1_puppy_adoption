package com.example.androiddevchallenge.ui.screen.details

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.context.LocalPuppiesRepository
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyDetailsScreen(uuid: String?, back: () -> Unit) {
    val repository = LocalPuppiesRepository.current
    val puppy = uuid?.let { repository.getById(uuid) }
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                Text(text = "Details for ${puppy?.name}")
                Button(onClick = back) {
                    Text(text = stringResource(id = R.string.back))
                }
            }
        }
    }
}
