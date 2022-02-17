package com.mraoj.jroek.Gagan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mraoj.jroek.R

class Gane : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(red = 0xF1, green = 0xAA, blue = 0x55, alpha = 0xFF)),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = "Major Joker", fontSize = 25.sp)

                Button(onClick = {
                        val byrik = Intent(this@Gane, GGTQ::class.java)
                        startActivity(byrik)
                    }
                ) {
                    Text(
                        text = "Start Game", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }
                Button(onClick = { Starq() }) {
                    Text(
                        text = "Privacy", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }

                Button(onClick = { finishAffinity() }) {
                    Text(
                        text = "Exit", modifier = Modifier.fillMaxWidth(0.3f),
                        fontWeight = FontWeight.Bold
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.personage),
                    contentDescription = null
                )
            }
        }
    }

    fun Starq() {
        val ueq = Intent(this, PRGAG::class.java)
        startActivity(ueq)
    }
}

