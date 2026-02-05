package com.redteam.app

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.redteam.app.attack_surface.AttackSurfaceScanner

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // === Red Team Tool Entry ===
        val scanner = AttackSurfaceScanner(this)
        val findings = scanner.scan()

        findings.forEach {
            Log.d(
                "RedTeam",
                "[${it.type}] exported=${it.exported} -> ${it.name}"
            )
        }
    }
}
