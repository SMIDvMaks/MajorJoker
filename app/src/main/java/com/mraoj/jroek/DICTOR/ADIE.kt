package com.mraoj.jroek.DICTOR

import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
var ad_id:String? = null
class ADIE {
    fun stretch(iiqp:Context){
        GlobalScope.launch {
            val ybtj:AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(iiqp)
            ad_id = ybtj.id
        }
    }
}