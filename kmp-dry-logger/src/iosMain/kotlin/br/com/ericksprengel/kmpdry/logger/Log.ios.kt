package br.com.ericksprengel.kmpdry.logger

import platform.Foundation.NSLog

public actual object Log {
    actual fun d(tag: String, msg: String) {
        NSLog("D $tag: $msg")
    }

    actual fun i(tag: String, msg: String) {
        NSLog("I $tag: $msg")
    }

    actual fun w(tag: String, msg: String) {
        NSLog("W $tag: $msg")
    }

    actual fun e(tag: String, msg: String) {
        NSLog("E $tag: $msg")
    }
}