package com.redteam.app.nfc

import android.nfc.NfcAdapter
import android.nfc.Tag
import com.redteam.app.core.StatusBus

object NfcController {

    fun onTagDetected(tag: Tag) {
        val uid = tag.id.joinToString("") { "%02X".format(it) }
        StatusBus.post("NFC TAG DETECTED | UID=$uid")
    }

    fun onIdle() {
        StatusBus.post("NFC IDLE")
    }
}
