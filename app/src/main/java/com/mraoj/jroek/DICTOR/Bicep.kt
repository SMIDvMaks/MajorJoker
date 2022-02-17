package com.mraoj.jroek.DICTOR

import android.content.Context
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import kotlinx.coroutines.DelicateCoroutinesApi
import java.util.*
var apps_static:String? = null
var apps_id:String? = null
var apps_key = "V3ZSa1dnSENkVDNnR0s5cUM3cnVQSw=="
var paramAp:String? = null
@DelicateCoroutinesApi
var pap = PARY()
class Bicep {
    fun LENGST(krzq: Context) {
        val hove = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(oirte: MutableMap<String, Any>?) {
                for (popu in oirte!!.keys)
                    apps_static =
                        Objects.requireNonNull(oirte[Dep.Muoq("YWZfc3RhdHVz")]).toString()
                Log.e("TAG","AppsStat: $apps_static")
                if (apps_static == Dep.Muoq("Tm9uLW9yZ2FuaWM=")) {
                    val kranh = Objects.requireNonNull(oirte[Dep.Muoq("Y2FtcGFpZ24=")]).toString()
                    paramAp = pap.ParseLine(kranh)
                }

            }

            override fun onConversionDataFail(p0: String?) {}
            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p0: String?) {}
        }
        apps_id = AppsFlyerLib.getInstance().getAppsFlyerUID(krzq)
        AppsFlyerLib.getInstance().run {
            init(Dep.Muoq(apps_key), hove, krzq)
            start(krzq)
        }
    }
}