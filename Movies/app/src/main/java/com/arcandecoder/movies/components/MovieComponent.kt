package com.arcandecoder.movies.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MoviewComponent(modifier: Modifier = Modifier){
    Column (modifier = Modifier
        .size(width = 100.dp, height = 150.dp)
        .background(Color.White)
    ) {
       Box(modifier = Modifier
           .fillMaxWidth()
           .height(120.dp)
           .background(Color.Red)){

       }

        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center)
        {
            Text( text = "Test")
        }
    }

}