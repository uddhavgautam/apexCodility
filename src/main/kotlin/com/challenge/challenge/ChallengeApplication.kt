package com.challenge.challenge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChallengeApplication {
    init {
        RestControllerChallenge()
    }
}

fun main(args: Array<String>) {
    runApplication<ChallengeApplication>(*args)
}
