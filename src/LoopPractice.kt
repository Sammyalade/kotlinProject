fun main(args: Array<String>) {
    var i: Int = 1;
    while(i < 10) {
        println("$i")
        i++
    }
    var sum: Int = 0
    var input: String

    do {
        println("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()
    } while (input != "0")

    println("Sum = $sum")
}
