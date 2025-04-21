package com.example.composequotesapp.presentation.ui.screen.detailscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequotesapp.presentation.components.ToolbarComponent
import com.example.composequotesapp.presentation.ui.screen.detailscreen.components.DetailQuotes


@Composable
fun DetailScreen() {
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            ToolbarComponent(
                showBackButton = true,
                title = "Detail",
                onBackPress = {

                })
        }

    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            DetailQuotes()
        }

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun DetailScreenPreview(modifier: Modifier = Modifier) {
    DetailScreen()
}

