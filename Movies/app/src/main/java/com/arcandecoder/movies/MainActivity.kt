package com.arcandecoder.movies

import android.media.browse.MediaBrowser.MediaItem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcandecoder.movies.ui.theme.MoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoviesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun MediaItem(){
    Column {
        Box(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color.Red)){
        }
        Text(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray),
            text = "Title")
    }
}


/*@Preview(showBackground = true,
    name = "TestPreview",
    widthDp = 400,
    heightDp = 200)
@Composable
fun GreetingPreview() {
    MoviesTheme {
        /*Box(
            Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Greeting("Fabian")
            Greeting(
                name = "Test",
                modifier = Modifier.align(Alignment.BottomEnd))
        }*/

       /* Column(
            modifier = Modifier.fillMaxSize(),
            //You can use it there bottom, center, top and others
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting(
                name = "Fabian",
                modifier = Modifier.background(Color.Red))
            Greeting(
                name = "Test",
                modifier = Modifier.background(Color.Yellow))
            Greeting(
                name = "JETPACK COMPOSE",
                modifier = Modifier.background(Color.Gray))
        }*/

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Greeting(
                name = "Fabian",
                modifier = Modifier.background(Color.Red))
            Greeting(
                name = "Test",
                modifier = Modifier.background(Color.Yellow))
            Greeting(
                name = "JETPACK COMPOSE",
                modifier = Modifier.background(Color.Gray))
        }
    }
}*/
