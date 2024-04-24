import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task1Test {

    @Test
    fun testTask1() {
        val array: Array<Int> = arrayOf(85, 92, 78, 88, 95, 20, 13)
        val expected = arrayOf(85, 92, 78, 88, 95)
        assertArrayEquals(expected, filterScore(array))
    }

    @Test
    fun testTask2() {
        val array: Array<Int> = arrayOf(85, 92, 78, 88, 95)
        val expected = arrayOf(90, 97, 83, 93, 100)
        assertArrayEquals(expected, increaseScore(array))
    }

    @Test
    fun testTask3() {
        val array: Array<Int> = arrayOf(2, 4, 6, 8, 10)
        val expected = arrayOf(4, 16, 36, 64, 100)
        assertArrayEquals(expected, squareOfNumbers(array))
    }

    @Test
    fun testTask4() {
        val array: Array<String> = arrayOf("9:00 AM", "11:00 AM", "1:00PM", "3:00 PM", "5:00 PM")
        val time = "PM"
        val result = checkTime(array, time)
        assertArrayEquals(result, arrayOf("1:00PM", "3:00 PM", "5:00 PM"))
    }

    @Test
    fun testTask5() {
        val expenses: Map<String, Int> = mapOf("groceries" to 150,
                                                "dining out" to 100,
                                                "transportation" to 50,
                                                "entertainment" to 80)
        val sum = expenseChecker(expenses)

        assertEquals(sum, 380)
    }

}