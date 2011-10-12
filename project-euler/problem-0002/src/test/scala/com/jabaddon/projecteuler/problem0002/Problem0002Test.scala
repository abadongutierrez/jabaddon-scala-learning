package com.jabaddon.projecteuler.problem0001
import org.junit.Test
import org.hamcrest.CoreMatchers._
import org.junit.Assert._

class Problem0002Test {
    
    @Test
    def testObtenerLos2UltimosElementosEnUnaLista() {
        val l1 = List(1, 2)
        val l2 = l1.drop(l1.length - 2)
        assertThat(l2, is(List(1, 2)))
        
        val l3 = List(1, 2, 4)
        val l4 = l3.drop(l3.length - 2)
        assertThat(l4, is(List(2, 4)))
    }
    
    @Test
    def testSumarLosDosUltimosElementos() {
        assertThat(List(1, 2, 3, 4).drop(2).foldLeft(0) {_ + _}, is(7))
    }
    
    @Test
    def testSolucionPseudoFuncional() {
        var x = 0
        var lista = List(1, 2)
        while (x <= 4000000) {
            x = lista.drop(lista.length - 2).foldLeft(0) { _ + _ }
            lista = lista ++ List(x)
        }
        assertThat(lista.filter(a => a % 2 == 0).foldLeft(0) { _ + _ }, is(4613732))
    }
    
    @Test
    def testSolucionRecursivaFuncional() {
        assertThat(fibUntil(List(1, 2), 4000000).filter(a => a % 2 == 0).foldLeft(0) { _ + _ },
            is(4613732))
    }
        
    def fibUntil(lista : List[Int], valorHasta : Int) : List[Int] = {
        if (lista.drop(lista.length - 2).foldLeft(0) { _ + _ } > valorHasta) {
            return lista
        }
        else {
            return fibUntil(lista ++ List(lista.drop(lista.length - 2).foldLeft(0) { _ + _ }), valorHasta)
        }
    }
}