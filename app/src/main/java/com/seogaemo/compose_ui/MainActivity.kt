package com.seogaemo.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.seogaemo.compose_ui.ui.theme.Compose_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_UITheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    var sliderValue by remember { mutableFloatStateOf(0f) }

    Column {
        Text(text = "Value: ${sliderValue.toInt()}")

        Slider(
            value = sliderValue,
            onValueChange = { newValue ->
                sliderValue = newValue
            },
            valueRange = 0f..100f,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_UITheme {
        Greeting()
    }
}