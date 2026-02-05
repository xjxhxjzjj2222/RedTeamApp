package com.redteam.app.attack_surface

import android.content.Context
import android.content.pm.PackageManager

class AttackSurfaceScanner(private val context: Context) {

    fun scan(targetPackage: String): List<SurfaceFinding> {
        if (!AttackSurfaceGuard.isAllowed(context, targetPackage)) {
            return emptyList()
        }

        val pm = context.packageManager
        val results = mutableListOf<SurfaceFinding>()

        val info = pm.getPackageInfo(
            targetPackage,
            PackageManager.GET_ACTIVITIES or
                    PackageManager.GET_SERVICES or
                    PackageManager.GET_RECEIVERS
        )

        info.activities?.forEach {
            if (it.exported) {
                results.add(
                    SurfaceFinding("Activity", it.name, it.permission)
                )
            }
        }

        info.services?.forEach {
            if (it.exported) {
                results.add(
                    SurfaceFinding("Service", it.name, it.permission)
                )
            }
        }

        info.receivers?.forEach {
            if (it.exported) {
                results.add(
                    SurfaceFinding("Receiver", it.name, it.permission)
                )
            }
        }

        return results
    }
}
