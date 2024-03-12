package com.jasoneastburn.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jasoneastburn.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    NameCard(name = "Jason Eastburn", title = "Android Developer")
    DetailCard(
        phoneNumber = "555-555-5555",
        handle = "@jason_eastburn",
        email = "jasoneastburn@gmail.com",
    )
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}

@Composable
fun NameCard(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .background(color = Color(0xFF073042))
        )
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF288457),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    BusinessCardTheme {
        NameCard(name = "Jason Eastburn", title = "Android Developer")
    }
}

@Composable
fun DetailCard(phoneNumber: String, handle: String, email: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                Icons.Rounded.Call,
                tint = Color(0xFF288457),
                contentDescription = null,
            )
            Text(
                text = phoneNumber,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                tint = Color(0xFF288457),
                contentDescription = null,
            )
            Text(
                text = handle,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                tint = Color(0xFF288457),
                contentDescription = null,
            )
            Text(
                text = email,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailCardPreview() {
    BusinessCardTheme {
        DetailCard(
            phoneNumber = "555-555-5555",
            handle = "@jason_eastburn",
            email = "jasoneastburn@gmail.com"
        )
    }
}