package br.com.ericksprengel.kmpdry.urllauncher

import java.awt.Desktop
import java.net.URI

actual fun launchUrl(url: String) {
    try {
        val desktop = Desktop.getDesktop()
        desktop.browse(URI.create(url))
    } catch(e: Exception) {
        // TODO: rethink error handling
        println("Unable to open url. Reason: ${e.stackTrace}")
    }
}