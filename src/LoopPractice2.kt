import java.util.*

fun main(args: Array<String>) {
    val arrays: Array<Int> = arrayOf(2, 6, 1, 9, 9);
    val resultArray = addOne(arrays)
    println(resultArray.contentToString())}
fun addOne(array: Array<Int>): Array<Int> {
    lateinit var newArray: Array<Int>;
    var increment: Int = 1;
    for (i in array.size - 1 downTo 0) {
        var sum: Int = array[i] + increment;
        if(sum == 10){
            array[i] = 0;
            increment = 1;
        }else{
            array[i] = sum;
            increment = 0;
            break;
        }
    }
    if (increment == 1){
        newArray = (listOf(1) + array).toTypedArray()
        return newArray;
    }
    return array;
}