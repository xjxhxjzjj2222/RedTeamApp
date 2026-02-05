package com.redteam.app.modules

import android.content.Context
import com.redteam.app.core.RedTeamModule
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

class ReportModule(
    private val results: List<String>
) : RedTeamModule {

    override val name = "Report Export"

    override fun run(context: Context): List<String> {
        val dir = context.filesDir

        val txtFile = File(dir, "redteam_report.txt")
        txtFile.writeText(results.joinToString("\n"))

        val json = JSONArray()
        results.forEach { json.put(it) }

        val jsonFile = File(dir, "redteam_report.json")
        jsonFile.writeText(
            JSONObject()
                .put("tool", "RedTeamApp")
                .put("results", json)
                .toString(2)
        )

        return listOf(
            "Report saved:",
            txtFile.absolutePath,
            jsonFile.absolutePath
        )
    }
}
