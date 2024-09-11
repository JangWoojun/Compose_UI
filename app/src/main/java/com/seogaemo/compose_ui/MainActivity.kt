package com.seogaemo.compose_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
//    Button(
//        onClick = {  },
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        modifier = Modifier.height(100.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        modifier = Modifier.height(100.dp).width(300.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        modifier = Modifier.size(200.dp, 300.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        modifier = Modifier.size(200.dp, 300.dp).background(Color.Black)
//
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Green
//        ),
//        modifier = Modifier
//            .size(200.dp, 300.dp)
//            .background(Color.Black)
//
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Green
//        ),
//        modifier = Modifier
//            .size(200.dp, 300.dp)
//            .background(Color.Black)
//            .padding(20.dp)
//
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = name)
//    }

//    Button(
//        onClick = {  },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Green
//        ),
//        modifier = Modifier
//            .size(200.dp, 300.dp)
//            .background(Color.White)
//            .padding(20.dp),
//        enabled = false
//    ) {
//        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(
//            text = name,
//            modifier = Modifier.clickable {  }
//        )
//    }

    Button(
        onClick = {  },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.Green
        ),
        modifier = Modifier
            .size(200.dp, 300.dp)
            .background(Color.White)
            .padding(20.dp),
    ) {
        Icon(imageVector = Icons.Filled.Done, contentDescription = null)
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            text = name,
            modifier = Modifier.offset((-14).dp, 40.dp)
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