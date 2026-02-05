package com.redteam.app.modules

import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*

object ReportModule {
 fun run(): String {
  val json = JSONObject()
  json.put("time", SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date()))
  json.put("status", "ok")
  json.put("scope", "training / defensive audit")
  return json.toString(2)
 }
}
