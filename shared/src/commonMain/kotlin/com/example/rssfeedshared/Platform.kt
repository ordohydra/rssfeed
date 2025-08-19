package com.example.rssfeedshared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform