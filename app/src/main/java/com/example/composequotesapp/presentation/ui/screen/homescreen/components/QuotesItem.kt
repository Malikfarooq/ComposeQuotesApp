package com.example.composequotesapp.presentation.ui.screen.homescreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequotesapp.presentation.ui.screen.homescreen.HomeScreen


@Composable
fun QuotesItem(
    color:Color= Color.White,
    textColor: Color=Color.Black,
    modifier: Modifier=Modifier
) {

    Card(
        modifier=modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ) {
            Text(
                text = "Dumy quotes...",
                modifier = Modifier.fillMaxWidth(),
                color=textColor,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "Mf Softs...",
                modifier = Modifier.fillMaxWidth(),
                color=textColor,
                textAlign = TextAlign.End,
                fontWeight = FontWeight.W100
            )

        }

    }

}

/* can be create multiple previews*/

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun QuotesItemPreview() {
    QuotesItem()
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private  fun QuotesItemPreview2() {
    QuotesItem(Color.Red,Color.Black)
}