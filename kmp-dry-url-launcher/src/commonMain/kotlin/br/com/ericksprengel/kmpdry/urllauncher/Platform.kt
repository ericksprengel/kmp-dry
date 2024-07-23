package br.com.ericksprengel.kmpdry.urllauncher

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform