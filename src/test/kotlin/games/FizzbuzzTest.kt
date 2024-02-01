package games

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class FizzbuzzTest {

    @Nested
    @DisplayName("Unit Tests for Fizzbuzz application")
    inner class UnitTest {
        @Test fun `When input is 3 Output is Fizz`() {
            val fizzbuzzApp = Fizzbuzz()
            val actual = fizzbuzzApp.fizzbuzz(3)
            assertEquals("Fizz", actual)
        }

        @Test fun `When input is 5 Output is Buzz`() {
            val fizzbuzzApp = Fizzbuzz()
            val actual = fizzbuzzApp.fizzbuzz(5)
            assertEquals("Buzz", actual)
        }

        @Test fun `When input is 15 Output is Fizzbuzz`() {
            val fizzbuzzApp = Fizzbuzz()
            val actual = fizzbuzzApp.fizzbuzz(15)
            assertEquals("Fizzbuzz", actual)
        }

        @Test fun `When input is anything else (num) Output is num`() {
            val fizzbuzzApp = Fizzbuzz()
            val actual = fizzbuzzApp.fizzbuzz(19)
            assertEquals("19", actual)
        }
    }
    @Nested
    @DisplayName("Integration Tests for Fizzbuzz application")
    inner class IntegrationTest {
        @Test fun `Some integration test`() {
            TODO()
        }

        @Test fun `Another integration test`() {
            TODO()
        }
    }

}