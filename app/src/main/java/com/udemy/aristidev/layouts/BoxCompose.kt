package com.udemy.aristidev.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.udemy.aristidev.ui.theme.UdemyAristiDevTheme

@Composable
fun MyBox(name: String) {
    Box(modifier = Modifier.background(Color.Cyan)) {
        Text("Esto es una prueba en $name")
    }
}

//Set a specifc size without scroll listener
@Composable
fun MyBoxWithSpecificSize() {
    Box(
        modifier = Modifier
            .background(Color.Red)
            .width(100.dp)
            .height(40.dp)
    ) {
        Text(
            "This is a text inside a Box with static side. The problem is that I'm " +
                    "not goign to be able to perform a scroll up/down to visualize all the text. " +
                    "That's why I need to add another property."
        )
    }
}

@Composable
fun MyBoxWithSpecificSizeAndScroll() {
    Box(
        modifier = Modifier
            .height(70.dp)
            .background(Color.Green)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            "This is a text inside a Box with static side. The problem is that I'm " +
                    "not goign to be able to perform a scroll up/down to visualize all the text. " +
                    "That's why I need to add another property. Incorrect! this one view contain" +
                    "the scroller"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UdemyAristiDevTheme {
        MyBoxMain()
    }
}

@Composable
fun MyBoxMain() {
    Column(modifier = Modifier.fillMaxSize()) {
        MyBox(name = "Android")
        MyBoxWithSpecificSize()
        MyBoxWithSpecificSizeAndScroll()
    }
}