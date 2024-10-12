package com.example.gestionnairedetaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestionnairedetaches.ui.theme.GestionnaireDeTachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnaireDeTachesTheme {
                    Surface (
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Greeting()
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.img)
        Image(
            painter = image,
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = modifier
                .size(120.dp)
        )
        Text(
            text = "All task completed",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = modifier
                .padding(start = 24.dp, end = 8.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "Nice Work",
            fontSize = 16.sp,
            modifier = modifier
                .padding(start = 24.dp, end = 8.dp),
            textAlign = TextAlign.Justify
        )
    }
}
