package com.mraoj.jroek

import android.app.Activity
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.mraoj.jroek.DICTOR.pap
import kotlinx.coroutines.DelicateCoroutinesApi

var finder:String? = null
var fincek:String? = null
@DelicateCoroutinesApi
class FID {
    fun fidce(id:String,context: Context){
        FacebookSdk.setApplicationId(id)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.sdkInitialize(context)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(context) { apolinocha ->
            var apichas = apolinocha
            if (apichas == null) {
                apichas = AppLinkData.createFromActivity(context as Activity?)
            }
            if (apichas != null) {
                val urisaq = apichas.targetUri
                finder = urisaq?.query.toString()
                fincek = pap.ParseLine(finder!!)
            }
        }
    }
}