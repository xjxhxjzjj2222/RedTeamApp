package com.redteam.app.core

private val listeners = mutableListOf<(String) -> Unit>()

object StatusBus {
    fun post(status: String) {
        AppState.status = status
        listeners.forEach { it(status) }
    }

    fun observe(listener: (String) -> Unit) {
        listeners.add(listener)
    }
}
