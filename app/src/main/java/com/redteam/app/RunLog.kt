object RunLog{fun log(c:android.content.Context,t:String){c.openFileOutput("run.log",android.content.Context.MODE_APPEND).write("${System.currentTimeMillis()}:$t
".toByteArray())}}