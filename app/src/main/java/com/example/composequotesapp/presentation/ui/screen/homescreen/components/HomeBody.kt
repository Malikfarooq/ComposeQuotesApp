package com.example.composequotesapp.presentation.ui.screen.homescreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeBody(
    /* Callback function passed from the parent composable,
     triggered on item click*/
    onClick: () -> Unit
) {

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
 /* Calls the onClick function when a QuotesItem is clicked*/

            QuotesItem(modifier = Modifier.clickable {
                onClick()
            })
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeBodyPreview() {
    HomeBody{

    }
}