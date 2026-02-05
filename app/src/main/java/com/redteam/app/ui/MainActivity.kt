package com.redteam.app.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.redteam.app.R
import com.redteam.app.tools.scanner.ScannerTool
import com.redteam.app.tools.network.NetworkTool
import com.redteam.app.tools.system.SystemTool
import com.redteam.app.tools.nfc.NfcTool

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.setBackgroundColor(0xFF000000.toInt())
        tv.setTextColor(0xFF00FF00.toInt())
        tv.text = listOf(
            ScannerTool(),
            NetworkTool(),
            SystemTool(),
            NfcTool()
        ).joinToString("\n") { "▶ ${it.name}: ${it.run()}" }
        setContentView(tv)
    }
}
