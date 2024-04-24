open class Person(private val name: String, private val age: Int) {
    init {
        println("My name is $name, the age is $age")
    }
}

class MathTeacher(val name: String, val age: Int) : Person("MathTeacher", 15) {
    fun teach(){}
}

class Footballer(val name: String, val age: Int) : Person("Footballer", 35) {
    fun playFootball(){}
}

class Businessman(val name: String, val age: Int, val height: Double) : Person("Businessman", 28) {
    fun runBusiness(){}
}