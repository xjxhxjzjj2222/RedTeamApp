package com.redteam.app.attack_surface

data class SurfaceFinding(
    val componentType: String,
    val name: String,
    val permission: String?
) {
    val risk: String
        get() = if (permission.isNullOrEmpty()) "HIGH" else "MEDIUM"
}
