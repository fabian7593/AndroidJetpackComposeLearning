package com.arcandecoder.affirmationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.captionBarPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import com.arcandecoder.affirmationapp.components.AffirmationList
import com.arcandecoder.affirmationapp.data.Datasource
import com.arcandecoder.affirmationapp.ui.theme.AffirmationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AffirmationAppTheme {

                val layoutDirection = LocalLayoutDirection.current
                 Surface(modifier = Modifier
                             .fillMaxSize()
                             .statusBarsPadding()
                             .navigationBarsPadding()
                             .captionBarPadding()
                             .padding(start = WindowInsets
                                 .safeDrawing
                                 .asPaddingValues()
                                 .calculateStartPadding(layoutDirection = layoutDirection),

                                 end = WindowInsets
                                     .safeDrawing
                                     .asPaddingValues()
                                     .calculateEndPadding(layoutDirection = layoutDirection))
                 )
                 {
                     AffirmationList(
                         affirmationList = Datasource().loadAffirmations()
                     )
                 }
            }
        }
    }
}


