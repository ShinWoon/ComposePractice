package com.example.composepractice.chapter4

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonPractice() {
    val context = LocalContext.current
    Surface {
        Button(onClick = {
            Toast.makeText(context, "Send clicked", Toast.LENGTH_SHORT)
        },
            enabled = true,
            border = BorderStroke(10.dp, Color.Yellow),
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            Icon(imageVector = Icons.Outlined.Send, contentDescription = "전송 버튼")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPracticePreview() {
    ButtonPractice()
}