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
import com.mraoj.jroek.DADA.FBid
import com.mraoj.jroek.DICTOR.*
import com.mraoj.jroek.Gagan.Gane
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.content.SharedPreferences
import android.view.Surface
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


var h = Heinkal()
var f = FID()

@DelicateCoroutinesApi
class MJ8 : ComponentActivity() {
    var adt = ADIE()
    var Bic = Bicep()
    var d = DART()
    var ViewCl = WebViewClient()
    var ones = "MjlmMjhkOTEtNTI5ZC00YzA2LWI1NmEtZTk4NWUwNjEyYTk3"
    private var Cald: ValueCallback<Array<Uri>>? = null
    var linkii: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        setContent {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Cici(percent = 0.8f, number = 100)
            }
        }
        adt.stretch(this)
        Bic.LENGST(this)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(Dep.Muoq(ones))
        var sPrefs = getSharedPreferences("com.mraoj.jroek", Context.MODE_PRIVATE);
        linkii = sPrefs.getString("Biki", null);

        ViewCl = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

            }

            @SuppressLint("CommitPrefEdits")
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                val editor: SharedPreferences.Editor = sPrefs.edit()
                editor.putString("Biki", url).apply()
            }
        }



        if (h.Hene(this) == 0) {
            if (linkii != null) {
                setContent {
                    Venegred(url = linkii.toString(), OhBack = { wedmid ->
                        if (wedmid?.canGoBack() == true) {
                            wedmid.goBack()
                        }
                    })
                }
            } else {
                GlobalScope.launch {
                    d.GG()
                    f.fidce(FBid!!, this@MJ8)
                }
                Handler(Looper.getMainLooper()).postDelayed({
                    setContent {
                        pap.startTest(this@MJ8)
                    }
                }, 5000)


            }
        } else {
            val intent = Intent(this, Gane::class.java)
            startActivity(intent)
            finish()
        }

    }

    @SuppressLint("SetJavaScriptEnabled")
    @Composable
    fun Venegred(url: String, OhBack: (webView: WebView?) -> Unit) {
        val Chromik = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?
            ): Boolean {
                if (Cald != null) {
                    Cald!!.onReceiveValue(null)
                    Cald = null
                }
                Cald = filePathCallback!!
                try {
                    startActivityForResult(fileChooserParams!!.createIntent(), 100)
                } catch (e: ActivityNotFoundException) {
                    Cald = null
                    return false
                }
                return true
            }
        }


        var wid: WebView? = null
        AndroidView(factory = { gtx ->
            WebView(gtx).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                this.webViewClient = ViewCl
                this.webChromeClient = Chromik
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
                loadUrl(url)
            }
        }, update = {
            wid = it
        })

        BackHandler {
            OhBack(wid)
        }
    }

//    @Composable
//    fun CircularProgressBarDemo() {
//        var progress by remember { mutableStateOf(0.1f) }
//        val animatedProgress = animateFloatAsState(
//            targetValue = progress,
//            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
//        ).value
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            CircularProgressIndicator(
//                progress = animatedProgress,
//                color = Color.Magenta,
//                strokeWidth = 12.dp,
//            )
//        }
//    }

    @Composable
    fun Cici(
        percent: Float,
        number: Int,
        fontikSize: TextUnit = 28.sp,
        radik: Dp = 50.dp,
        color: Color = Color.DarkGray,
        strokeWidth: Dp = 8.dp,
        anikDurik: Int = 1000,
        anikDelik: Int = 0
    ) {
        var anikPlayer by remember {
            mutableStateOf(false)
        }
        val currPerc = animateFloatAsState(
            targetValue = if (anikPlayer) percent else 0f,
            animationSpec = tween(
                durationMillis = anikDurik,
                delayMillis = anikDelik
            )
        )
        LaunchedEffect(key1 = true) {
            anikPlayer = true
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(radik * 2f)
        ) {
            Canvas(modifier = Modifier.size(radik * 2f)) {
                drawArc(
                    color = color,
                    -90f,
                    360 * currPerc.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(text = (currPerc.value * number).toInt().toString(),
            color = Color.Black,
            fontSize = fontikSize,
            fontWeight = FontWeight.Bold
            )

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (Cald == null) return
        Cald!!.onReceiveValue(
            WebChromeClient.FileChooserParams.parseResult(
                resultCode,
                data
            )
        )
        Cald = null
    }


}
