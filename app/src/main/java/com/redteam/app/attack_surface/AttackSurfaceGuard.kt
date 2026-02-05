package com.redteam.app.attack_surface

import android.content.Context

object AttackSurfaceGuard {

    fun isAllowed(context: Context, targetPackage: String): Boolean {
        // 僅允許掃描自己，避免濫用
        return context.packageName == targetPackage
    }
}
