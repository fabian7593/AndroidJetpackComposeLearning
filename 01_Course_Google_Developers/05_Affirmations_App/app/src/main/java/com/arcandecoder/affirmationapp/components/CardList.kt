package com.arcandecoder.affirmationapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcandecoder.affirmationapp.R
import com.arcandecoder.affirmationapp.data.Affirmation
import com.arcandecoder.affirmationapp.ui.theme.AffirmationAppTheme

@Composable
fun CardList(affirmation : Affirmation, modifier: Modifier = Modifier) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 45.dp
        ),
        modifier = modifier
    ) {

        Column (modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)){

            Image(

                painter = painterResource(affirmation.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(165.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(affirmation.stringResourceId),
                textAlign = TextAlign.Start,
                modifier = Modifier
                            .padding(10.dp),
                style= MaterialTheme.typography.headlineSmall
            )

        }
    }
}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    AffirmationAppTheme {
        val affirmation = Affirmation(
            stringResourceId = R.string.affirmation1,
            imageResourceId = R.drawable.image1
        )

        CardList(affirmation)
    }
}