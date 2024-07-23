package br.com.ericksprengel.kmpdry.logger


public expect object Log {
    public fun d(tag: String, msg: String)
    public fun i(tag: String, msg: String)
    public fun w(tag: String, msg: String)
    public fun e(tag: String, msg: String)
}