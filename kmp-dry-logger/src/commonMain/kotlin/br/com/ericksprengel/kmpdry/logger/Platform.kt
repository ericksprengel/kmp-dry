package br.com.ericksprengel.kmpdry.logger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform