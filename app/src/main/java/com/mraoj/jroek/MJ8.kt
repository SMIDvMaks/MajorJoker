package com.mraoj.jroek

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.ViewGroup
import android.webkit.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.viewinterop.AndroidView
import com.mraoj.jroek.DADA.DART
import com.mraoj.jroek.DADA.loyba
import com.mraoj.jroek.DICTOR.*
import com.mraoj.jroek.Gagan.Gane
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.content.SharedPreferences
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
var h = Heinkal()
@OptIn(DelicateCoroutinesApi::class)
var f = FID()
var librpne: String? = null
var Kololoeq: ValueCallback<Array<Uri>>? = null
var Chererhe: SharedPreferences? = null


@DelicateCoroutinesApi
class MJ8 : ComponentActivity() {
    var pap = PARY(this)
    var adt = ADIE()
    var Bic = Bicep()
    var d = DART()
    var pepo = WebViewClient()
    var Chrooomik = WebChromeClient()
    var ones = "MjlmMjhkOTEtNTI5ZC00YzA2LWI1NmEtZTk4NWUwNjEyYTk3"
    var pep = "Z2FwcHM9NDA0"
    override fun onCreate(sapinaq: Bundle?) {
        super.onCreate(sapinaq)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(Dep.Muoq(ones))
        setContent {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.mipmap.bg),
                contentDescription = Dep.Muoq("YmFja2dyb3VuZF9pbWFnZQ=="),
                contentScale = ContentScale.FillBounds
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Cici(pertse = 0.8f, nyny = 100)
            }
        }
        adt.stretch(this)
        Bic.LENGST(this)
        Chererhe = getSharedPreferences(Dep.Muoq("Y29tLm1yYW9qLmpyb2Vr"), Context.MODE_PRIVATE)
        librpne = Chererhe?.getString("Loperesupere", null)
        pepo = object : WebViewClient() {
            override fun onPageStarted(innntf: WebView?, lalql: String?, zzaq: Bitmap?) {
                super.onPageStarted(innntf, lalql, zzaq)
                if (lalql?.contains(Dep.Muoq(pep)) == true) {
                    val oqos = Intent(this@MJ8, Gane::class.java)
                    startActivity(oqos)
                    finish()
                }
            }

            @SuppressLint("CommitPrefEdits")
            override fun onPageFinished(pipa: WebView?, zipas: String?) {
                super.onPageFinished(pipa, zipas)
                val editor: SharedPreferences.Editor? = Chererhe?.edit()
                editor?.putString("Loperesupere", zipas)?.apply()
            }
        }
        Chrooomik = object : WebChromeClient() {
            override fun onShowFileChooser(
                uuewq: WebView?,
                fifife: ValueCallback<Array<Uri>>?,
                gegegreq: FileChooserParams?
            ): Boolean {
                if (Kololoeq != null) {
                    Kololoeq!!.onReceiveValue(null)
                    Kololoeq = null
                }
                Kololoeq = fifife
                try {
                    val nnenq = Intent(Intent.ACTION_GET_CONTENT)
                    nnenq.addCategory(Intent.CATEGORY_OPENABLE)
                    nnenq.type = "*/*"
                    startActivityForResult(Intent.createChooser(nnenq, "Tinreed"), 100)
                } catch (epopo: ActivityNotFoundException) {
                    Kololoeq = null
                    return false
                }
                return true
            }
        }

        if (h.Hene(this) == 0) {
            if (librpne != null) {
                setContent {
                    Venegred(entiki = librpne.toString(), feefi = { wedmid ->
                        if (wedmid?.canGoBack() == true) {
                            wedmid.goBack()
                        }
                    }, pepo, Chrooomik)
                }
            } else {
                GlobalScope.launch {
                    d.GG()
                    f.fidce(loyba!!, this@MJ8)
                }
                Handler(Looper.getMainLooper()).postDelayed({
                    setContent {
                        pap.Handere(this)
                    }
                }, 5500)
            }
        } else {
            val intent = Intent(this, Gane::class.java)
            startActivity(intent)
            finish()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Composable
    fun Venegred(
        entiki: String, feefi: (depchek: WebView?) -> Unit,
        wegVV: WebViewClient, weikCH: WebChromeClient
    ) {

        var wid: WebView? = null
        AndroidView(factory = { gtx ->
            WebView(gtx).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                this.webViewClient = wegVV
                this.webChromeClient = weikCH
                settings.apply {
                    setAppCacheEnabled(true)
                    allowFileAccessFromFileURLs = true
                    saveFormData = true
                    mixedContentMode = 0
                    savePassword = true
                    allowContentAccess = true
                    setRenderPriority(WebSettings.RenderPriority.HIGH)
                    setEnableSmoothTransition(true)
                    loadsImagesAutomatically = true
                    allowUniversalAccessFromFileURLs = true
                    databaseEnabled = true
                    loadWithOverviewMode = true
                    useWideViewPort = true
                    javaScriptCanOpenWindowsAutomatically = true
                    domStorageEnabled = true
                    allowFileAccess = true
                    javaScriptEnabled = true
                }
                wid = this
                loadUrl(entiki)
            }
        }, update = {
            wid = it
        })

        BackHandler {
            feefi(wid)
        }
    }

    @Composable
    fun Cici(
        pertse: Float,
        nyny: Int,
        fontikSize: TextUnit = 28.sp,
        radik: Dp = 50.dp,
        polor: Color = Color.DarkGray,
        starer: Dp = 8.dp,
        anikDurik: Int = 1000,
        anikDelik: Int = 0
    ) {
        var ancokise by remember {
            mutableStateOf(false)
        }
        val cupecece = animateFloatAsState(
            targetValue = if (ancokise) pertse else 0f,
            animationSpec = tween(
                durationMillis = anikDurik,
                delayMillis = anikDelik
            )
        )
        LaunchedEffect(key1 = true) {
            ancokise = true
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(radik * 2f)
        ) {
            Canvas(modifier = Modifier.size(radik * 2f)) {
                drawArc(
                    color = polor,
                    -90f,
                    360 * cupecece.value,
                    useCenter = false,
                    style = Stroke(starer.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(
                text = (cupecece.value * nyny).toInt().toString(),
                color = Color.Black,
                fontSize = fontikSize,
                fontWeight = FontWeight.Bold
            )

        }
    }

    override fun onActivityResult(inetre: Int, iresw: Int, datersa: Intent?) {
        super.onActivityResult(inetre, iresw, datersa)
        if (inetre == 100) {
            if (Kololoeq == null) return
            Kololoeq!!.onReceiveValue(
                WebChromeClient.FileChooserParams.parseResult(
                    iresw,
                    datersa
                )
            )
            Kololoeq = null
        }
    }


}
