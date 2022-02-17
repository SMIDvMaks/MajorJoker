package com.mraoj.jroek

import android.content.Context
import android.provider.Settings

class Heinkal {
    fun Hene(vert:Context):Int{
        val ty = 0
        val tyna = Settings.Secure.getInt(vert.contentResolver,
        Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,ty)
        return tyna
    }
}