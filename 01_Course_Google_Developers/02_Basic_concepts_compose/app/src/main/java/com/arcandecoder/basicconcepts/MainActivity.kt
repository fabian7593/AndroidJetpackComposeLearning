package com.arcandecoder.basicconcepts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.arcandecoder.basicconcepts.ui.Page.PersonalInformation
import com.arcandecoder.basicconcepts.ui.components.MainSpace
import com.arcandecoder.basicconcepts.ui.theme.BasicConceptsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicConceptsTheme {
                Surface{
                    PersonalInformation()
                }
            }
        }
    }
}

