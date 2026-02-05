package com.redteam.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   Column(
    modifier = Modifier
     .fillMaxSize()
     .background(Color.Black)
     .padding(16.dp)
   ) {
    Text("RED TEAM CONTROL PANEL", color = Color(0xFF00FF41))
    Spacer(Modifier.height(12.dp))
    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
     Text("Recon Module")
    }
    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
     Text("Audit Module")
    }
    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
     Text("Defense Simulation")
    }
   }
  }
 }
}
MaterialTheme(colorScheme = darkColorScheme(primary = Color(0xFF00FF41))) {
