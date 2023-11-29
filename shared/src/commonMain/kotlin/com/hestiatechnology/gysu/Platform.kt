package com.hestiatechnology.gysu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform