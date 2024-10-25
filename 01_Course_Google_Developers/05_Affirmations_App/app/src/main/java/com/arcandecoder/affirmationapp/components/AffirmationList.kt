package com.arcandecoder.affirmationapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arcandecoder.affirmationapp.data.Affirmation

@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList){ affirmation ->
            CardList(affirmation= affirmation,
                modifier = Modifier.padding(16.dp))
        }
    }
}