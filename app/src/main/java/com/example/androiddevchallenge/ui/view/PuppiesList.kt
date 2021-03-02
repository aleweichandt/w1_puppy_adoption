package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PuppiesList(puppies: List<Puppy>, onPuppySelected: (uuid: String) -> Unit) {
    MyTheme {
        LazyColumn(contentPadding = PaddingValues(bottom = 16.dp)) {
            stickyHeader {
                PuppiesListHeader()
            }
            items(puppies) { puppy ->
                PuppyListItem(puppy = puppy, onPuppySelected = onPuppySelected)
            }
        }
    }
}

@Composable
fun PuppiesListHeader() {
    Column(
        Modifier
            .background(color = MaterialTheme.colors.surface)
            .padding(8.dp)) {
        Text(text = stringResource(id = R.string.welcome), style = typography.h5)
        Text(
            text = stringResource(id = R.string.welcome_body),
            style = typography.body1,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}
