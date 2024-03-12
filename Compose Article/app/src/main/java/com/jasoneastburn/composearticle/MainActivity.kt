package com.jasoneastburn.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jasoneastburn.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tutorial(
                        title = stringResource(R.string.jetpack_compose_title),
                        definition = stringResource(R.string.jetpack_definition),
                        explanation = stringResource(R.string.jetpack_explanation)
                    )
                }
            }
        }
    }
}

@Composable
fun Tutorial(title: String, definition: String, explanation: String, modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Image(
            painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = definition,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = explanation,
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    ComposeArticleTheme {
        Tutorial(
            title = stringResource(R.string.jetpack_compose_title),
            definition = stringResource(R.string.jetpack_definition),
            explanation = stringResource(R.string.jetpack_explanation))
    }
}