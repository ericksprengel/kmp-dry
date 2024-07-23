package br.com.ericksprengel.kmpdry.logger

public actual object Log {
    actual fun d(tag: String, msg: String) {
        println("D ${tag}: $msg")
    }

    actual fun i(tag: String, msg: String) {
        println("I ${tag}: $msg")
    }

    actual fun w(tag: String, msg: String) {
        println("W ${tag}: $msg")
    }

    actual fun e(tag: String, msg: String) {
        println("E ${tag}: $msg")
    }
}