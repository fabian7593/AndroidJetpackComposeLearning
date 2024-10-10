package com.arcandecoder.movies.components

import android.graphics.drawable.Icon
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Preview(showBackground = true)
@Composable
fun MoviewComponent(modifier: Modifier = Modifier){
    Column (modifier = Modifier
        .fillMaxSize()
        .height(350.dp)
        .background(Color.White)
    ) {
       Box(modifier = Modifier
           .fillMaxWidth()
           .height(300.dp)
           .background(Color.Red)){

           AsyncImage(
               model = "https://raw.githubusercontent.com/fabian7593/Tenshi/main/00_external_information/imgs/tenshi_background.png",
               contentDescription = null,
               modifier = Modifier.fillMaxSize(),
               contentScale = ContentScale.Fit,
               // Opcional: Puedes agregar placeholders y manejo de errores
               // placeholder = painterResource(R.drawable.placeholder),
               // error = painterResource(R.drawable.error)
           )

            Icon(imageVector = Icons.Default.PlayArrow,
                contentDescription = null,
                modifier = Modifier.size(92.dp)
                    .align(alignment = Alignment.Center),
                tint = Color.White)
       }

        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center)
        {
            Text( text = "Test",
                style = MaterialTheme.typography.labelMedium)
        }
    }

}