package com.arcandecoder.basicconcepts.ui.Page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arcandecoder.basicconcepts.ui.components.ContactSpace
import com.arcandecoder.basicconcepts.ui.components.MainSpace
import com.arcandecoder.basicconcepts.ui.theme.BasicConceptsTheme

@Composable
fun PersonalInformation(modifier: Modifier = Modifier) {
        Column(modifier = modifier.fillMaxSize()) {
            MainSpace("Fabian Rosales", "Arcane Coder")
            ContactSpace(phone = "+506 83461166",
                socialMedia = "fabian-rosales-mobiledev",
                email = "fabian7593@gmail.com")
        }
}