package br.com.ericksprengel.kmpdry.urllauncher

import platform.Foundation.NSURL
import platform.UIKit.UIApplication

actual fun launchUrl(url: String) {
    val application = UIApplication.sharedApplication
    val nsurl = NSURL(string = url)
    if (!application.canOpenURL(nsurl)) {
        // TODO: rethink error handling
        println("Unable to open url: $url")
        return
    }
    application.openURL(nsurl)
}