package com.jabaddon.scala

import org.junit.Test 
import junit.framework._
import org.junit.Assert._

class MatesTest {
    @Test
    def debeSumarCorrectamente() {
        def mates = new Mates()
        assertTrue(3.equals(mates.sumar(1,2)))     
    }
    
    @Test
    def debeRestarCorrectamente() {
        def mates = new Mates()
        assertTrue(3.equals(mates.restar(5,2)))
    }
}
