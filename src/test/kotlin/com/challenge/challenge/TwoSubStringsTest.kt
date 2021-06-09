package com.challenge.challenge

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TwoSubStringsTest {

    private var twoSubStrings: TwoSubStrings? = null

    @BeforeEach
    fun setUp() {
        twoSubStrings = TwoSubStrings()
    }

    @AfterEach
    fun tearDown() {
        twoSubStrings = null
    }

    //case 1
    @Test
    fun testCheckTwoString1() {
        twoSubStrings?.checkTwoString("art", "ammo")
    }

    //case 2
    @Test
    fun testCheckTwoString2(){
        twoSubStrings?.checkTwoString("be", "cat")
    }

    //case 3
    @Test
    fun testCheckTwoString3(){
        twoSubStrings?.checkTwoString("", "")
    }

    //case 4
    @Test
    fun testCheckTwoString4(){
        twoSubStrings?.checkTwoString("art", "bxgt")
    }

    //case 5
    @Test
    fun testCheckTwoString5() {
        twoSubStrings?.checkTwoString(null, null)
    }

    //case 6
    @Test
    fun testCheckTwoString6() {
        twoSubStrings?.checkTwoString(null, 3.toString())
    }

}