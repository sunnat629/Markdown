package dev.sunnat629.markdown

import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.util.AttributeSet

import android.webkit.WebView

/**
 * This is a CustomWebView to handle the lollipop webview crash.
 *
 * Solution link: https://stackoverflow.com/questions/31732169/error-inflating-class-android-webkit-webview-happens-sporadically-in-production
 * */
open class WebViewIncludeLollipop : WebView {
    constructor(context: Context) : super(
        getFixedContext(
            context
        )
    )

    constructor(
        context: Context,
        attrs: AttributeSet?
    ) : super(
        getFixedContext(
            context
        ), attrs
    )

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        getFixedContext(
            context
        ),
        attrs,
        defStyleAttr
    )

    companion object {
        // To fix Android Lollipop WebView problem create a new configuration on that Android version only
        private fun getFixedContext(context: Context) =
            if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22)
                context.createConfigurationContext(Configuration())
            else context
    }
}