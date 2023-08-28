package com.example.composepractice.chapter4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composepractice.CloudButton

@Composable
fun ChapterFourScreen() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {
        CloudButton(btnTxt = "TextButton") {

        }
        CloudButton(btnTxt = "ButtonButton") {

        }

    }
}