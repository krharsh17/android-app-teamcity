package dev.draft.mytestapp

import org.junit.Test

import org.junit.Assert.*
import kotlin.ArithmeticException

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(0, 2-2)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(1, 2/2)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, 2*2)
    }

    @Test(expected = ArithmeticException::class)
    fun division_byZeroIsUndefined() {
        2/0
    }


}