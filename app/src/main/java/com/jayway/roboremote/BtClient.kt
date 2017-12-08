package com.jayway.roboremote

import android.bluetooth.BluetoothAdapter
import android.util.Log


class BtClient {

    private val bt: BluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

    init {
        if (!bt.isEnabled) {
            bt.enable()
        }
        Log.d("BtClient", "%s : %s".format(bt.name, bt.address))

        val devices = bt.bondedDevices.map { it.name }
    }

    companion object {
        fun supportsBluetooth() : Boolean = BluetoothAdapter.getDefaultAdapter() != null
    }
}
