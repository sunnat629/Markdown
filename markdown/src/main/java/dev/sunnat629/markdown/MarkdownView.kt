package dev.sunnat629.markdown

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.AttributeSet
import android.util.Base64
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import java.io.*
import java.util.regex.Pattern

class MarkdownView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) :
    WebViewIncludeLollipop(context, attrs, defStyleAttr) {


    private var mPreviewText: String? = null
    var isOpenUrlInBrowser = false

    init {
        initialize()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initialize() {
        webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                evaluateJavascript(mPreviewText, null)
            }

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                if (isOpenUrlInBrowser) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    context.startActivity(intent)
                    return true
                }
                return false
            }
        }

        loadUrl("file:///android_asset/html/demo.html")
        settings.javaScriptEnabled = true
        settings.allowUniversalAccessFromFileURLs = true
        settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
    }

    fun loadMarkdownFromFile(markdownFile: File) {
        try {
            val fileInputStream = FileInputStream(markdownFile)
            val inputStreamReader = InputStreamReader(fileInputStream)
            val bufferedReader = BufferedReader(inputStreamReader)
            var readText: String?
            val stringBuilder = StringBuilder()
            while (bufferedReader.readLine().also { readText = it } != null) {
                stringBuilder.append(readText)
                stringBuilder.append("\n")
            }
            fileInputStream.close()
            loadMarkdownFromText(stringBuilder.toString())
        } catch (e: FileNotFoundException) {
            Log.e(TAG, "FileNotFoundException:$e")
        } catch (e: IOException) {
            Log.e(TAG, "IOException:$e")
        }
    }

    fun loadMarkdownFromAssets(assetsFileName: String) {
        try {
            val buf = StringBuilder()
            val json = context.assets.open(assetsFileName)
            val `in` = BufferedReader(InputStreamReader(json, "UTF-8"))
            var str: String?
            while (`in`.readLine().also { str = it } != null) {
                buf.append(str).append("\n")
            }
            `in`.close()
            loadMarkdownFromText(buf.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun loadMarkdownFromText(markdownText: String) {
        val bs64MdText = imgToBase64(markdownText)
        val escMdText = escapeForText(bs64MdText)
        mPreviewText = "demo('$escMdText')"
        initialize()
    }

    private fun escapeForText(mdText: String): String {
        var escText = mdText.replace("\n", "\\\\n")
        escText = escText.replace("'", "\\\'")
        escText = escText.replace("\r", "")
        return escText
    }

    private fun imgToBase64(mdText: String): String {
        val ptn = Pattern.compile(IMAGE_PATTERN)
        val matcher = ptn.matcher(mdText)
        if (!matcher.find()) {
            return mdText
        }
        val imgPath = matcher.group(2)
        if (isUrlPrefix(imgPath) || !isPathExCheck(imgPath)) {
            return mdText
        }
        val baseType = imgEx2BaseType(imgPath)
        if ("" == baseType) {
            return mdText
        }
        val file = File(imgPath)
        val bytes = ByteArray(file.length().toInt())
        try {
            val buf = BufferedInputStream(FileInputStream(file))
            buf.read(bytes, 0, bytes.size)
            buf.close()
        } catch (e: FileNotFoundException) {
            Log.e(TAG, "FileNotFoundException:$e")
        } catch (e: IOException) {
            Log.e(TAG, "IOException:$e")
        }
        val base64Img = baseType + Base64.encodeToString(bytes, Base64.NO_WRAP)
        return mdText.replace(imgPath, base64Img)
    }

    private fun isUrlPrefix(text: String): Boolean {
        return text.startsWith("http://") || text.startsWith("https://")
    }

    private fun isPathExCheck(text: String): Boolean {
        return (text.endsWith(".png")
                || text.endsWith(".jpg")
                || text.endsWith(".jpeg")
                || text.endsWith(".gif"))
    }

    private fun imgEx2BaseType(text: String): String {
        return if (text.endsWith(".png")) {
            "data:image/png;base64,"
        } else if (text.endsWith(".jpg") || text.endsWith(".jpeg")) {
            "data:image/jpg;base64,"
        } else if (text.endsWith(".gif")) {
            "data:image/gif;base64,"
        } else {
            ""
        }
    }

    companion object {
        private val TAG = MarkdownView::class.java.simpleName
        private const val IMAGE_PATTERN = "!\\[(.*)]\\((.*)\\)"
    }
}