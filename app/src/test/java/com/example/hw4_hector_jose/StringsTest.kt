package com.example.hw4_hector_jose


import org.junit.Assert.*
import org.junit.Test

class StringsTest{
    val testingObjects = Strings()
    val arraytest= arrayOf("AAA","","BBB","","CCC")

    @Test
    fun testiffirstlast(){
        assertEquals(-1,testingObjects.searchR(arraytest,"AAA",4,0))
    }

    @Test
    fun testFail(){
        assertEquals(-1,testingObjects.searchR(arraytest,"BBB",3,0))
    }

    @Test
    fun testsearchRNE(){
        assertEquals(-1, testingObjects.searchR(arraytest, "DDD", 0, 4))
    }

    @Test
    fun searchRtest(){
        assertEquals(0,testingObjects.searchR(arraytest,"AAA",0,4))
    }

    @Test
    fun searchRLtest(){
        assertEquals(4,testingObjects.searchR(arraytest,"CCC",0,4))
    }


    @Test
    fun testMid(){
        assertEquals(2,testingObjects.search(arraytest,"BBB"))
    }

    @Test
    fun testsearchifEmpty(){
        assertEquals(-1,testingObjects.search(arraytest,""))
    }

    @Test
    fun testsearchifNull(){
        assertEquals(-1,testingObjects.search(arraytest,null))
    }

    @Test
    fun testingR(){
        assertEquals(4,testingObjects.search(arraytest,"CCC"))

    }

    @Test
    fun testingL(){
        assertEquals(0,testingObjects.search(arraytest,"AAA"))
    }

}