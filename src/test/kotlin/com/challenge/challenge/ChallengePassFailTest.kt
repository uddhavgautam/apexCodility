package com.challenge.challenge

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ChallengePassFailTest() {

    private var challengePassFail: ChallengePassFail = ChallengePassFail()

    private lateinit var list1Challenge: List<Challenge>
    private lateinit var list2Challenge: List<Challenge>
    private lateinit var list3Challenge: List<Challenge>
    private lateinit var nullList: List<Challenge>

    @BeforeEach
    fun setUp() {
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
    }

    @AfterEach
    fun tearDown() {
        list1Challenge = nullList
        list2Challenge = nullList
        list3Challenge = nullList
        nullList = nullList
    }

    //we could put separate test for each list type, and that is recommended.
    //Assuming this is simple task, we put all assert statements inside one method although it is not best practice
    @Test
    fun isPassing() {
        Assertions.assertEquals(false, challengePassFail.isPassing(list1Challenge))
        Assertions.assertEquals(true, challengePassFail.isPassing(list2Challenge))
        Assertions.assertEquals(true, challengePassFail.isPassing(list3Challenge))
        Assertions.assertEquals(null, challengePassFail.isPassing(nullList))
    }
}