package com.example.hw4_hector_jose


import org.junit.Assert.*
import org.junit.Test

class Stacks_P1Test{
    val testingObjects = Stacks_P1()

    @Test
    fun testPointer() {
        assertEquals(testingObjects.stackPointer[0],-1)
    }

    @Test
    fun testPush(){
        testingObjects.push(1,1)
        assertEquals(testingObjects.peek(1),1)
    }

    @Test
    fun testPush1(){
        testingObjects.stackSize = 0
        val exception = assertThrows(Exception::class.java){
            testingObjects.push(1,1)
        }
        assertEquals("Out of space.", exception.message)
    }

    @Test
    fun testPop() {
        testingObjects.push(1,1)
        testingObjects.pop(1)
        assertEquals(testingObjects.peek(1),0)
    }
    @Test
    fun testPop1(){
        val exception = assertThrows(Exception::class.java){
            testingObjects.pop(0)
        }
        assertEquals("Trying to pop an empty stack.", exception.message)
    }

    @Test
    fun testPeek(){
        assertEquals(testingObjects.peek(1),0)
    }

    @Test
    fun testPeek1(){
        testingObjects.push(0,2)
        assertNotNull(testingObjects.peek(0))
    }

    @Test
    fun testisEmpty(){
        assertTrue(testingObjects.isEmpty(1))

    }
    @Test
    fun testisEmpty1(){
        testingObjects.push(1,1)
        assertFalse(testingObjects.isEmpty(1))
    }

    @Test
    fun testabsTopOfStack(){
        assertEquals(testingObjects.absTopOfStack(1),99)

    }

}