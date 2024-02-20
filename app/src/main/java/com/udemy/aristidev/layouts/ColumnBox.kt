package com.udemy.aristidev.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.udemy.aristidev.ui.theme.UdemyAristiDevTheme

/**
 * Let other components aligns one below the other
 */
@Composable
fun MyColumnsWithWeight() {
    Column {
        Text(
            "Example with weight. This one only have 1f", modifier = Modifier
                .weight(1f)
                .background(
                    Color.Red
                )
        )
        Text(
            "this one has 2f", modifier = Modifier
                .weight(2f)
                .background(Color.Cyan)
        )
        Text(
            text = "This is the last one and only have 1f",
            modifier = Modifier
                .weight(1f)
                .background(Color.Blue)
        )
    }
}

@Composable
fun MyColumnsWithoutWeight() {
    //Put Every Text only in the space by default. It's the wrap content
    Column {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
    }
    Spacer(modifier = Modifier.height(50.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnDefaultPreview() {
    UdemyAristiDevTheme {
        MyColumnMain()
    }
}

@Composable
fun MyColumnMain() {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            MyColumnsWithWeight()
        }
        Spacer(
            modifier = Modifier
                .height(40.dp)
                .background(Color.Green)
        )
        Column(modifier = Modifier.weight(1f)) {
            MyColumnsWithoutWeight()
        }
    }
}