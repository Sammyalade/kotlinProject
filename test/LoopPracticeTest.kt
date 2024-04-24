import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LoopPracticeTest {

    @Test
    fun testLoopPractice() {
        val arrays: Array<Int> = arrayOf(2, 6, 1, 9, 9);
        assertArrayEquals(arrayOf(2, 6, 2, 0, 0), addOne(arrays));
    }

}