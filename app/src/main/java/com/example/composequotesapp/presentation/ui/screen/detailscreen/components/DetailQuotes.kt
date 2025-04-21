package com.example.composequotesapp.presentation.ui.screen.detailscreen.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DetailQuotes() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
              Text(
                  text = "Demo Quotes",
                  modifier = Modifier.fillMaxWidth().weight(1f),
                  color = Color.Black,
                  textAlign = TextAlign.Justify,
                  fontSize = 14.sp,
                  fontWeight = FontWeight.Bold
              )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = "Testing quote",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                textAlign = TextAlign.End,
                fontSize = 12.sp,
                fontWeight = FontWeight.W300
            )
         }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DetailQuotesPreview() {
    DetailQuotes()
}