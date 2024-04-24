fun filterScore(array: Array<Int>): Array<Int> {
    var newArray: ArrayList<Int> = arrayListOf()
    for (i in array.indices) {
        if (array[i] > 70) {
            newArray.add(array[i])
        }
    }
    return newArray.toTypedArray()
}

fun increaseScore(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        array[i] += 5
    }
    return array
}

fun squareOfNumbers(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        array[i] *= array[i]
    }
    return array
}

fun checkTime(array: Array<String>, time: String): Array<String> {
    val newArray: ArrayList<String> = arrayListOf()
    for (i in array.indices) {
        if(array[i].endsWith(time)) {
            newArray.add(array[i])
        }
    }
    return newArray.toTypedArray()
}


fun expenseChecker(budget: Map<String, Int>): Int {
    var sum: Int = 0
    for((key, value) in budget) {
        sum += value
    }
    return sum
}