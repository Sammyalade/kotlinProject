import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    println("Enter animal name: ")
    var animal: String = input.nextLine()

    if (animal == "Cat"){
        println(animal)
    } else if (animal == "Dog"){
        println(animal)
    } else {
        println("animal is not cat or dog")
    }

    when (animal) {
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("animal is not cat or dog")
    }
}