import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class FizzBuzzTest {

    @Test
    @Parameters("1, 1", "2, 2", "4, 4", "7, 7", "8, 8", "11, 11", "13, 13")
    fun `เลขใดๆ`(expected: Int, actual: String) {
        assertEquals(FizzBuzz().say(expected), actual)
    }

    @Test
    @Parameters("3, Fizz", "6, Fizz", "9, Fizz", "12, Fizz")
    fun `เลขใดหารสามลงตัวแสดงFizz`(expected: Int, actual: String) {
        assertEquals(FizzBuzz().say(expected), actual)
    }

    @Test
    @Parameters("5, Buzz", "10, Buzz")
    fun `เลขใดหารห้าลงตัวแสดงฺBuzz`(expected: Int, actual: String) {
        assertEquals(FizzBuzz().say(expected), actual)
    }

    @Test
    @Parameters("15, FizzBuzz", "30, FizzBuzz")
    fun `เลขใดหารสามและห้าลงตัวแสดงฺFizzBuzz`(expected: Int, actual: String) {
        assertEquals(FizzBuzz().say(expected), actual)
    }
}