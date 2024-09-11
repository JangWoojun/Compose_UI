package com.seogaemo.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seogaemo.compose_ui.ui.theme.Compose_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_UITheme {
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
//    Row (modifier = Modifier.height(40.dp)) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }

//    Row (modifier = Modifier.height(40.dp)) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.align(alignment = Alignment.Bottom)
//        )
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.align(alignment = Alignment.Top)
//        )
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.align(alignment = Alignment.CenterVertically)
//        )
//    }

//    Row (
//        modifier = Modifier.height(40.dp),
//        verticalAlignment = Alignment.Bottom,
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.align(alignment = Alignment.Top)
//        )
//        Text(
//            text = "Hello $name!",
//        )
//        Text(
//            text = "Hello $name!",
//        )
//    }

    Row (
        modifier = Modifier.size(200.dp, 40.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello",
            modifier = Modifier.weight(1f).background(Color.Red)
        )
        Text(
            text = "Hello",
            modifier = Modifier.weight(2f).background(Color.Blue)
        )
        Text(
            text = "Hello",
            modifier = Modifier.weight(3f).background(Color.Magenta)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_UITheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}