package com.challenge.challenge

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestControllerChallenge {

    var list1Challenge: List<Challenge>? = null
    var list2Challenge: List<Challenge>? = null
    var list3Challenge: List<Challenge>? = null
    var nullList: List<Challenge>? = null

    var challengeMap: HashMap<Int, List<Challenge>> = HashMap()

    init {
        listInit()
    }


    private fun listInit() {
        list1Challenge = listOf(Challenge("question 1", "answer 1", false))
        list2Challenge = listOf(
            Challenge("question 1", "answer 1", false),
            Challenge("question 2", "answer 2", true),
            Challenge("question 3", "answer 3", true),
            Challenge("question 4", "answer 4", true),
            Challenge("question 5", "answer 5", true),
            Challenge("question 6", "answer 6", true),
            Challenge("question 7", "answer 7", true),
            Challenge("question 8", "answer 8", true),
            Challenge("question 9", "answer 9", true),
            Challenge("question 10", "answer 10", true)
        )
        list3Challenge = listOf(Challenge("question 1", "answer 1", true))
        nullList = emptyList()

        //create a hashmap based on interviewId
        challengeMap[1] = list1Challenge!!
        challengeMap[2] = list2Challenge!!
        challengeMap[3] = list3Challenge!!
    }


    @GetMapping("/")
    fun indexPage(): String {
        return "Hello Uddhav!"
    }


    @RequestMapping("/errorPage")
    fun errorPage(): String? {
        return "Error!"
    }

    @RequestMapping("/otherMapping")
    fun otherMapping(): String? {
        return "Greetings from Spring Boot!"
    }

    @RequestMapping("/interviews/{interviewId}")
    fun getChallenge(@PathVariable(value = "interviewId") interviewId: Int): List<Challenge>? {
        return when (interviewId) {
            1 -> challengeMap[1]
            2 -> challengeMap[2]
            3 -> challengeMap[3]
            else -> nullList
        }
    }
}

