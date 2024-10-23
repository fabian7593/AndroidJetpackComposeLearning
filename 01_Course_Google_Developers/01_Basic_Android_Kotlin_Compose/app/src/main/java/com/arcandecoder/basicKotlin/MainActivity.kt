package com.arcandecoder.basicKotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.unit.sp
import com.arcandecoder.basicKotlin.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background){
                    GreetingImage("Sam", "From Emma")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(name: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)

    Box(modifier){
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.align(Alignment.Center),
            alpha = 0.5F
        )
        GreetingText(name = name, from = from, modifier =
        Modifier
            .fillMaxSize()
            .padding(8.dp))
    }
}

@Composable
fun GreetingText(name: String, from: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column (modifier = Modifier
            .padding(8.dp)
            .align(Alignment.Center),
               verticalArrangement = Arrangement.Center) {
            Text(
                text = stringResource(R.string.happy_birthday_text, name),
                fontSize = 100.sp,
                lineHeight = 110.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = from,
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        GreetingImage("Sam",
            "From Emma",
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan))
    }
}