package com.seogaemo.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
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
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier,
//            textAlign = TextAlign.Center,
//            color = Color.White
//        )
//    }

//    Box(
//        modifier = Modifier
//            .size(200.dp)
//            .background(Color.Black),
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.align(Alignment.BottomEnd),
//            textAlign = TextAlign.Center,
//            color = Color.White
//        )
//        Text(
//            text = "Bye $name!",
//            modifier = modifier.align(Alignment.TopStart),
//            textAlign = TextAlign.Center,
//            color = Color.White
//        )
//    }
//    Box(
//        modifier = Modifier
//            .size(200.dp)
//            .border(BorderStroke(2.dp, Color.Black))
//    ) {
//        Box(modifier = Modifier.size(70.dp).background(Color.Red))
//        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.BottomEnd))
//    }

//    Box(
//        modifier = Modifier
//            .border(BorderStroke(2.dp, Color.Black))
//    ) {
//        Box(modifier = Modifier.matchParentSize().background(Color.Red))
//        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.BottomEnd))
//    }

    Box(
        modifier = Modifier
            .border(BorderStroke(2.dp, Color.Black))
    ) {
        Box(modifier = Modifier.fillMaxSize().background(Color.Red))
        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.BottomEnd))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_UITheme {
        Scaffold(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 10.dp)
        ) { innerPadding ->
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}