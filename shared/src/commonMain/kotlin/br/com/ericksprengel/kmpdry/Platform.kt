package br.com.ericksprengel.kmpdry

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform