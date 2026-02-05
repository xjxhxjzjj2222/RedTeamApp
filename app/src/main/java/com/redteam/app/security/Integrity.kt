package com.redteam.app.security

import android.os.Build

object Integrity{fun isEmulator()=Build.FINGERPRINT.contains("generic")||Build.MODEL.contains("Emulator");fun isRootLikely()=listOf("/system/bin/su","/system/xbin/su").any{java.io.File(it).exists()}}