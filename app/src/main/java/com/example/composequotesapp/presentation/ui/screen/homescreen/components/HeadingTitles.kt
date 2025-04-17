package com.example.composequotesapp.presentation.ui.screen.homescreen.components

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HeadingTitles(title: String) {
    Text(
        text = title,
        fontSize = 12.sp,
        color = Color.Black,
        fontWeight = FontWeight.Black,
        modifier = Modifier.fillMaxWidth().padding(12.dp)
    )
    
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HeadingTitlesPreview(title: String) {
    HeadingTitles("Random Quotes")
}

