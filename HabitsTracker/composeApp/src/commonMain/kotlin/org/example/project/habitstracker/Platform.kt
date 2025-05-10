package org.example.project.habitstracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform