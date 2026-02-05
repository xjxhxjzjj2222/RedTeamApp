package com.redteam.app.core

import android.content.Context

interface RedTeamModule {
    val name: String
    fun run(context: Context): List<String>
}
