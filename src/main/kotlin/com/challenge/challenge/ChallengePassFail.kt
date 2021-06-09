package com.challenge.challenge

import java.util.function.Consumer

//DriverClass is where we define isPassing() function
class ChallengePassFail {
    fun isPassing(challenges: List<Any?>): Boolean? {
        //challenges can contain challenge1, challenge2, ......, challengeN

        if (challenges.isEmpty()) return null

        //counter is used to count the number of right answers
        var counter = 0
        val bar: Double = challenges.size * 0.875
        var response = false

        //iterate over challenges, if right answer increment counter and immediately check response
        with(challenges, {
            //iterate over challenges, if right answer increment counter and immediately check response
            forEach(Consumer {
                run {
                    if ((it as Challenge).correct) {
                        counter++
                        if (counter > bar) {
                            response = true
                            return@run
                        }
                    }
                }
            })
        })
        return response
    }

}

