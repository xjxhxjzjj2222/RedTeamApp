package com.redteam.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.redteam.app.modules.*

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   var output by remember { mutableStateOf("READY") }
   MaterialTheme(colorScheme = darkColorScheme(primary = Color(0xFF00FF41))) {
    Column(Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
     Text("RED TEAM CONTROL PANEL", color = Color(0xFF00FF41))
     Spacer(Modifier.height(12.dp))
     ModuleRegistry.modules.forEach {
      Button(onClick = { output = it.run() }, modifier = Modifier.fillMaxWidth()) {
       Text(it.javaClass.simpleName)
      }
     }
     Spacer(Modifier.height(16.dp))
     Text("OUTPUT:", color = Color(0xFF00FF41))
     Text(output, color = Color.White)
    }
   }
  }
 }
}
