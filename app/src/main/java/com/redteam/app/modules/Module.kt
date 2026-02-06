package com.redteam.app.modules

abstract class Module {
    abstract val id: String
    abstract val name: String
    abstract val enabled: Boolean

    abstract fun run()
}
