package com.challenge.challenge


class LongestCommonSubString {

    fun getLength(string1: String?, string2: String?): Int? {
        //create an 2-d array of size m*n, where m is the size string1, and n is size of string n
        //e.g., string1 = fulsome (m = rows = 7), string2 = beautiful (n = columns = 9)
        if (string1 != null && string2 != null) {
            var resultArray = Array(string1.length) { IntArray(string2.length) } //all resultArray[i][j] = 0

            for (i in string2.indices) {
                //initialize resultArray first row
                if (string1[0] == string2[i]) {
                    resultArray[0][i] = 1
                }
            }

            for (i in 1 until string1.length) {
                //initialize resultArray first column leaving first element
                if (string2[0] == string1[i]) {
                    resultArray[i][0] = 1
                }
            }
            //dynamic programming solution
            for (i in 1 until string1.length) {
                for (j in 1 until string2.length) {
                    if (string1[i] == string2[j]) {
                        //resultArray[i][j] and resultArray[i-1][j-1] means subsequent elements
                        resultArray[i][j] = resultArray[i - 1][j - 1] + 1
                    }
                }
            }

            var length = 0

            for (i in string1.indices) {
                for (j in string2.indices) {
                    if (resultArray[i][j] > length) {
                        length = resultArray[i][j]
                    }
                }
            }
            return length
        }
        return null
    }
}

fun main() {
    println(LongestCommonSubString().getLength("fulsome", "beautiful")) //case 1
    println(LongestCommonSubString().getLength("onder", "onder")) //case 2
    println(LongestCommonSubString().getLength(" ", "onder")) //case 3
    println(LongestCommonSubString().getLength(null, null)) //case 4
    println(LongestCommonSubString().getLength("nopefghmnopqrst", "nopq")) //case 5
}
