class Girl {
    var age : Int = 0
    get() = field
    set(value) {
        field = if (value < 18) 18
            else if (value >= 18 && value <= 30) value
            else value-3
    }
    var actualAge: Int = 0
}

fun main(args: Array<String>) {
    val angela = Girl()
    angela.age = 15
    angela.actualAge = 15
    println(angela.actualAge)
    println(angela.age)

    val maria = Girl()
    maria.age = 35
    maria.actualAge = 35
    println(maria.actualAge)
    println(maria.age)
}