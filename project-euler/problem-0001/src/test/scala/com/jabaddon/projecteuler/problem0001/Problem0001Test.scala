package com.jabaddon.projecteuler.problem0001
import org.junit.Test
import org.hamcrest.CoreMatchers._
import org.junit.Assert._

class Problem0001Test {
    
    @Test
    def testRangeAsList() {
        assertThat((0 to 3).toList, is(List(0, 1, 2, 3)))
    }
    
    @Test
    def testFilterEvenNumbersInAList() {
        assertThat((0 to 10).toList.filter((a: Int) => a % 2 == 0), is(List(0, 2, 4, 6, 8, 10)))
    }
    
    @Test
    def testNaturalNumbersBelow10ThatAreMultiplesOf3Or5() {
        assertThat((1 to (10 - 1)).toList.filter(a => a % 3 == 0 || a % 5 == 0), is(List(3, 5, 6, 9)))
    }
    
    @Test
    def testProblem0001Solution() {
        val multiples3Or5 = (1 to (1000 - 1)).toList.filter(a => a % 3 == 0 || a % 5 == 0)
        assertThat(multiples3Or5.reduce((a, b) => a + b), is(233168))
    }
}