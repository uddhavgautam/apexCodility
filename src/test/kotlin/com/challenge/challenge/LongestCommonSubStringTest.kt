package com.challenge.challenge

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LongestCommonSubStringTest {

    private var longestCommonSubString: LongestCommonSubString? = null

    @BeforeEach
    fun setUp() {
        longestCommonSubString = LongestCommonSubString()

        println(LongestCommonSubString().getLength("fulsome", "beautiful")) //case 1
        println(LongestCommonSubString().getLength("onder", "onder")) //case 2
        println(LongestCommonSubString().getLength(" ", "onder")) //case 3
        println(LongestCommonSubString().getLength(null, null)) //case 4
        println(LongestCommonSubString().getLength("nopefghmnopqrst", "nopq")) //case 5
    }

    @AfterEach
    fun tearDown() {
        longestCommonSubString = null
    }

    //case1
    @Test
    fun testGetLength1() {
        assertEquals(3, longestCommonSubString?.getLength("fulsome", "beautiful"))
    }

    //case2
    @Test
    fun testGetLength2() {
        assertEquals(5, longestCommonSubString?.getLength("onder", "onder"))
    }

    //case3
    @Test
    fun testGetLength3() {
        assertEquals(0, longestCommonSubString?.getLength(" ", "onder"))
    }

    //case4
    @Test
    fun testGetLength4() {
        assertEquals(null, longestCommonSubString?.getLength(null, null))
    }

    //case5
    @Test
    fun testGetLength5() {
        assertEquals(4, longestCommonSubString?.getLength("nopefghmnopqrst", "nopq"))
    }
}