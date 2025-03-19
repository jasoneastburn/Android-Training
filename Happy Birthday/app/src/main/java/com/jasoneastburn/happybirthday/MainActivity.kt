package com.jasoneastburn.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jasoneastburn.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(color = MaterialTheme.colors.background) {
                    BlueAccessScreen()
                }
            }
        }
    }
}

@Composable
fun BlueAccessScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top Section with Logo and Title
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground), // Replace with your logo resource
                contentDescription = "BlueAccess Logo",
                modifier = Modifier.size(48.dp)
            )
            Text(
                text = "Kansas",
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "BlueAccess",
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }

        // System Maintenance Message
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            color = Color.LightGray.copy(alpha = 0.5f),
            shape = MaterialTheme.shapes.medium
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "System Maintenance",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Due to system maintenance BlueAccess may be unavailable on Sunday, March 16th, between 5 and 10 am.",
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "We apologize for the inconvenience.",
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Log In Button
        Button(
            onClick = { /* Handle login */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {
            Text(text = "Log In")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sign Up Link
        TextButton(onClick = { /* Handle sign up */ }) {
            Text(text = "Don't have an account? Sign Up")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Bottom Text
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Blue Cross and Blue Shield of Kansas serves all counties in Kansas except Johnson and Wyandotte. Blue Cross and Blue Shield of Kansas is an independent licensee of the Blue Cross Blue Shield Association. ® Registered Trademarks of the Blue Cross Blue Shield Association.",
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Version 1.11.0",

                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        BlueAccessScreen()
    }
}