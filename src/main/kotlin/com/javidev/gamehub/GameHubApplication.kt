package com.javidev.gamehub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GameHubApplication

fun main(args: Array<String>) {
    runApplication<GameHubApplication>(*args)
}
