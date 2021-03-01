package com.example.androiddevchallenge.ui.context

import androidx.compose.runtime.compositionLocalOf
import com.example.androiddevchallenge.domain.PuppiesRepository

val LocalPuppiesRepository = compositionLocalOf<PuppiesRepository> { error("no repository found") }
