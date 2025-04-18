package com.example.composequotesapp.presentation.ui.screen.homescreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeBody() {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        item {
            HeadingTitles("Random Quote")
            RandomQuotesItem()
        }
        item {
            HeadingTitles("Quotes")
        }
        items(10) {
            QuotesItem()
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeBodyPreview() {
    HomeBody()
}