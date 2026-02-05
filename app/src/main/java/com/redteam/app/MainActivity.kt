package com.redteam.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.redteam.app.core.ModuleRegistry

class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

val output = findViewById<TextView>(R.id.output)
val list = findViewById<RecyclerView>(R.id.toolList)
list.layoutManager = LinearLayoutManager(this)

val modules = ModuleRegistry.load(this)
list.adapter = ToolAdapter(modules) { result ->
output.text = result.joinToString("\n")
}
}
}
