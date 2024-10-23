package com.arcandecoder.basicconcepts.ui.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arcandecoder.basicconcepts.R

@Composable
fun ContactComponent(imageVector : ImageVector, textText: String, modifier: Modifier = Modifier) {
   Row(modifier = modifier.padding(2.dp)
   ){

       Icon(imageVector = imageVector,
           contentDescription = null,
           modifier = Modifier.size(20.dp),
           tint = colorResource(id = R.color.teal_700))


        Text(modifier = Modifier.padding(15.dp, 0.dp).align(Alignment.CenterVertically),
         text = textText,
         fontSize = 14.sp,
         fontWeight = FontWeight.Normal,
         style = MaterialTheme.typography.bodySmall)
   }
}