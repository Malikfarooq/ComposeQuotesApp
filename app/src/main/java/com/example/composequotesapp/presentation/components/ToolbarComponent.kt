package com.example.composequotesapp.presentation.components

import android.icu.text.CaseMap.Title
import android.widget.Toolbar
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolbarComponent(
    title:String,
    showBackButton:Boolean = false,
    onBackPress:()-> Unit = {}
){
    TopAppBar(
        title = {
            Text(
                 text = title,
                 modifier = Modifier.fillMaxWidth(),
                 fontSize = 10.sp,
                 fontWeight = FontWeight.Bold,
                 textAlign = TextAlign.Center
            )
        },
        navigationIcon = {
            if(showBackButton){
                 IconButton(onClick = onBackPress) {
                     Icon(Icons.Default.ArrowBack,
                         contentDescription ="Back",
                         tint = Color.Black ,
                         modifier = Modifier
                             .size(30.dp)
                             .padding(5.dp)
                     )
                 }
            }
        },

       actions = {
           if(showBackButton){
               Spacer(modifier = Modifier.size(30.dp))
           }
       }


    )


}