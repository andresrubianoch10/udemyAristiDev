package com.udemy.aristidev.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
    Text(
        "This is not going to be able to see it due to when we're working with weight, " +
                "the space must be to only one screen without scroll state. Also, it's important to " +
                "not have modifiers of weight in the compose functions inside this one."
    )
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
    MyCustomDescription(
        text = "This section contain 3 Text from compose. They're not using weight and the container is another" +
                "Column inside that modify the height to 50dp and add a vertical scroll with remember scroll state:"
    )
    Column(
        modifier = Modifier
            .height(50.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
    }
}

@Composable
fun MyColumnsSpaceBetween100Dp() {
    MyCustomDescription(
        text = "SpaceBetween align all the text inside the column taking in mind " +
                "the size of the container and adding the space automatically between each other"
    )
    Column(
        modifier = Modifier
            .height(100.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        ExampleText()
    }
}

@Composable
fun MyColumnsSpaceAround() {
    MyCustomDescription(text = "This sections show 3 components that are together. This " +
            "is how Space around works. It was necessary to remove the static size to make it" +
            "compatible with this functionality")
    Column(
        verticalArrangement = Arrangement.SpaceAround
    ) {
        ExampleText()
    }
}

@Composable
fun MyColumnMain() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        MyCustomSpace("Columns/No-Weight/VerArr = SpaceAround")
        MyColumnsSpaceAround()
        MyCustomSpace("Columns/No-Weight/VerArr = SpaceBetweem/Height = 100dp")
        MyColumnsSpaceBetween100Dp()
        MyCustomSpace("Columns with Weight")
        MyColumnsWithWeight()
        MyCustomSpace("Columns without Weight")
        MyColumnsWithoutWeight()
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
fun ExampleText() {
    Text("Text 1")
    Text("Text 2")
    Text("Text 3")
}