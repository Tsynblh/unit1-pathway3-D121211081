package com.example.unit1p3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
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
import com.example.unit1p3.ui.theme.Unit1P3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1P3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    BusinessCardPreview()
                }
            }
        }
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Box(
            modifier = Modifier
                .background(Color(0xFF073042))
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
        }
        Text(
            text = "Tasya Nabila Hasanuddin",
            fontSize = 31.sp,
            fontWeight = FontWeight.W300,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "Informatics Engineering Student",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF006833),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun ContactP(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(top = 200.dp, bottom = 35.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
        ){
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text ="+62 895 2451 4341",
                modifier = Modifier
                    .padding(start = 19.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
        ){
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text ="@tsynblh",
                modifier = Modifier
                    .padding(start = 19.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
        ){
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text ="tsynblh03@gmail.com",
                modifier = Modifier
                    .padding(start = 19.dp))
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
    )

@Composable
fun BusinessCardPreview() {
    Unit1P3Theme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth()
        ){
            Profile()
            ContactP()
        }
    }
}