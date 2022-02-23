package com.mraoj.jroek.DICTOR

import android.content.Context
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import kotlinx.coroutines.DelicateCoroutinesApi
import java.util.*

var arappap: String? = null
var idead: String? = null
var kketrik = "V3ZSa1dnSENkVDNnR0s5cUM3cnVQSw=="
var papsikq: String? = null

@DelicateCoroutinesApi
class Bicep {
    fun LENGST(krzq: Context) {
        val hove = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(oirte: MutableMap<String, Any>?) {
                for (popu in oirte!!.keys)
                    arappap =
                        Objects.requireNonNull(oirte[Dep.Muoq("YWZfc3RhdHVz")]).toString()
                if (arappap == Dep.Muoq("Tm9uLW9yZ2FuaWM=")) {
                    val qjsa = Objects.requireNonNull(oirte[Dep.Muoq("Y2FtcGFpZ24=")]).toString()
                    papsikq = KindCheckLoop(qjsa)
                }
            }

            override fun onConversionDataFail(p0: String?) {}
            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p0: String?) {}
        }
        idead = AppsFlyerLib.getInstance().getAppsFlyerUID(krzq)
        AppsFlyerLib.getInstance().run {
            init(Dep.Muoq(kketrik), hove, krzq)
            start(krzq)
        }
    }
}