fun main() {

    print("> ")
    val age = readln().toDouble()
    val realAge = calculateDogAge(age)

    print(realAge)
}


private fun calculateDogAge(age: Double): Double{
    return age * 7

}