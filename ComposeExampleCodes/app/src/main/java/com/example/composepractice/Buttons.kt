package com.example.composepractice

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CloudButton(
    btnTxt : String,
    action : () -> Unit
) {
    Button(onClick = action,
        colors = ButtonDefaults.buttonColors(Color(0xFF00909A))
    ) {
        Text(text = btnTxt,
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        )
    }
}