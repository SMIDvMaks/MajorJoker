package com.mraoj.jroek

import android.app.Activity
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.mraoj.jroek.DICTOR.KindCheckLoop
import kotlinx.coroutines.DelicateCoroutinesApi

var finder:String? = null
var fincek:String? = null
@DelicateCoroutinesApi
class FID {
    fun fidce(iclaTigra:String, oyTekia: Context){
        FacebookSdk.setApplicationId(iclaTigra)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.sdkInitialize(oyTekia)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(oyTekia) { potente ->
            var kiahe = potente
            if (kiahe == null) {
                kiahe = AppLinkData.createFromActivity(oyTekia as Activity?)
            }
            if (kiahe != null) {
                val uy = kiahe.targetUri
                finder = uy?.query.toString()
                fincek = KindCheckLoop(finder!!)
            }
        }
    }
}