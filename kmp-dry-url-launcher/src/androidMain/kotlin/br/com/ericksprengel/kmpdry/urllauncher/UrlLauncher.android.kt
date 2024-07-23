package br.com.ericksprengel.kmpdry.urllauncher

import android.content.Context
import android.content.Intent
import android.net.Uri

// TODO: what's the best way to handle context? Should it be activity lifecycle aware?
public lateinit var activityContext: Context

actual fun launchUrl(url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    activityContext.startActivity(intent)
}