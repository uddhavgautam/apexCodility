package com.challenge.challenge

import java.util.*

class TwoSubStrings {
    fun checkTwoString(s1: String?, s2: String?): Boolean {
        val map1: MutableMap<Char, Int> = HashMap()
        val map2: MutableMap<Char, Int> = HashMap()
        s1?.forEach { element ->
            map1[element] = 1
        }
        s2?.forEach { element ->
            map2[element] = 1
        }
        for ((key) in map1) {
            if (map2[key] != null) {
                return true
            }
        }
        return false
    }

}

fun main() {
    println(TwoSubStrings().checkTwoString("art", "ammo")) //case 1
    println(TwoSubStrings().checkTwoString("be", "cat")) //case 2
    println(TwoSubStrings().checkTwoString("", "")) //case 3
    println(TwoSubStrings().checkTwoString("art", "bxgt")) //case 4
    println(TwoSubStrings().checkTwoString(null, null)) //case 5
    println(TwoSubStrings().checkTwoString(null, 3.toString())) //case 5
}