package com.seogaemo.compose_ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
                        context = this,
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, context: Context? = null, name: String,) {
//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier) {
//        Text(text = "Hello $name!")
//    }

//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Text(text = "Hello $name!")
//    }

//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Hello $name!")
//    }

//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier, enabled = false) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Hello $name!")
//    }

//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier, enabled = true, border = BorderStroke(10.dp, Color.Magenta)) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Hello $name!")
//    }

//    Button(onClick = {
//        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
//    }, modifier = modifier,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta),
//        shape = RoundedCornerShape(10.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Hello $name!")
//    }

    Button(onClick = {
        Toast.makeText(context, "버튼 클릭", Toast.LENGTH_SHORT).show()
    }, modifier = modifier,
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(50.dp)
    ) {
        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Hello $name!")
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