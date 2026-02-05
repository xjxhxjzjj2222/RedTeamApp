package com.redteam.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.redteam.app.modules.ReconModule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ReconModule.run()
    }
}
