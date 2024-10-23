package com.arcandecoder.basicconcepts.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arcandecoder.basicconcepts.R
import com.arcandecoder.basicconcepts.ui.Page.PersonalInformation
import com.arcandecoder.basicconcepts.ui.theme.BasicConceptsTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun MainSpace(name: String, title:String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.profile_picture)
    Box(modifier = Modifier){
        Column(Modifier.padding(15.dp, 200.dp, 15.dp, 0.dp)
            .fillMaxWidth()
            .height(230.dp)
            ) {

            Image(modifier =
                Modifier.size(150.dp)
                .align(Alignment.CenterHorizontally),
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillBounds)

            TextTitle(modifier =
            Modifier.align(Alignment.CenterHorizontally),
                name = name,
                fontSize = 30.sp)

            TextTitle(modifier =
                Modifier.align(Alignment.CenterHorizontally),
                name = title
                )
        }
    }
}

@Composable
fun ContactSpace(phone: String, email: String,
                 socialMedia:String,
                 modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.padding(15.dp)
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
        ) {
            ContactComponent(
                modifier = modifier.align(Alignment.CenterHorizontally),
                imageVector = Icons.Filled.Phone,
                textText = phone)

            ContactComponent(
                modifier = modifier.align(Alignment.CenterHorizontally),
                imageVector = Icons.Filled.Email,
                textText = email)

            ContactComponent(
                modifier = modifier.align(Alignment.CenterHorizontally),
                imageVector = Icons.Filled.Share,
                textText = socialMedia)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    BasicConceptsTheme() {
        PersonalInformation(modifier = Modifier.padding(0.dp,0.dp,0.dp, 75.dp))
    }
}