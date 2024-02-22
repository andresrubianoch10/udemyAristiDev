package com.udemy.aristidev.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCustomSpace(text: String = "", modifierParam: Modifier = Modifier.height(25.dp)) {
    Spacer(modifier = modifierParam.background(Color.Cyan))
    Text(text, modifier = Modifier
        .fillMaxWidth()
        .background(Color.Cyan))
    Spacer(modifier = modifierParam)
}