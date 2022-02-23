package com.mraoj.jroek.DICTOR

import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
var tireses:String? = null
@DelicateCoroutinesApi
class ADIE {
    fun stretch(iiqp:Context){
        GlobalScope.launch {
            val retq:AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(iiqp)
            tireses = retq.id
        }
    }
}