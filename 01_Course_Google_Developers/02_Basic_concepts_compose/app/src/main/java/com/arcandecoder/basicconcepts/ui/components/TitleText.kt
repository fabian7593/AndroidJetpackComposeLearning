package com.arcandecoder.basicconcepts.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextTitle(name: String, fontSize: TextUnit? = null, modifier: Modifier = Modifier) {
    Text(modifier = modifier,
        text = name,
        fontSize = fontSize ?: 16.sp,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.titleLarge
    )
}