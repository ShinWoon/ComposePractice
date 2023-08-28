package com.example.composepractice.chapter4

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextPractice() {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Text(color = Color.DarkGray, text = "test")
        Text(color = Color(0xffff9944), text = "test")
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "텍스트 연습 페이지 줄1.\n텍스트 연습 페이지 줄2.\n텍스트 연습 페이지 줄3.",
            color = Color.DarkGray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            letterSpacing = 2.sp,
            maxLines = 2,
            textDecoration = TextDecoration.LineThrough,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextPracticePreview() {
    TextPractice()
}