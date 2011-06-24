package com.jabaddon.scala

import org.junit.Test 
import junit.framework._
import org.junit.Assert._

class HolaMundoTest {
    @Test
    def debeImprimirHola() = {
        def hola = new HolaMundo()
        hola.hola()
    }
}
