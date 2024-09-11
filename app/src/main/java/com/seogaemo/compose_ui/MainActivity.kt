package com.seogaemo.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
//    Surface {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }

//    Surface(modifier = Modifier.padding(0.dp, 100.dp, 0.dp, 0.dp)) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }

//    Surface(
//        modifier = Modifier.padding(0.dp, 100.dp, 0.dp, 0.dp),
//        shadowElevation = 10.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }

//    Surface(
//        modifier = Modifier.padding(0.dp, 100.dp, 0.dp, 0.dp),
//        shadowElevation = 10.dp,
//        border = BorderStroke(2.dp, Color.Magenta)
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }

    Surface(
        modifier = Modifier.padding(0.dp, 100.dp, 0.dp, 0.dp),
        shadowElevation = 10.dp,
        border = BorderStroke(2.dp, Color.Magenta),
        shape = CircleShape,
        color = MaterialTheme.colorScheme.error,
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
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