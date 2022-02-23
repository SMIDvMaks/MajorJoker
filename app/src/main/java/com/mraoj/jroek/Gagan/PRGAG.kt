package com.mraoj.jroek.Gagan

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.mraoj.jroek.DICTOR.Dep

class PRGAG : ComponentActivity() {
    override fun onCreate(jupok: Bundle?) {
        super.onCreate(jupok)
        window.addFlags(1024)
        setContent {
            UQU(denisa = Dep.Muoq("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49RVpqREFEYU5zSUZDbkE4bDhOaTdUZVdyVjhyMlBkSzM="))
        }
    }

    @Composable
    fun UQU(denisa: String) {
        AndroidView(factory = {
            WebView(this).apply {
                loadUrl(denisa)
            }
        })
    }
}

