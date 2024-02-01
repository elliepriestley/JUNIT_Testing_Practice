package games

class Fizzbuzz {
    fun fizzbuzz(inputNum: Int): String {
        return when {
            inputNum % 3 == 0 && inputNum % 5 == 0 -> {
                "Fizzbuzz"
            }
            inputNum % 5 == 0 -> {
                "Buzz"
            }
            inputNum % 3 == 0 -> {
                "Fizz"
            }
            else -> {
                inputNum.toString()
            }
        }
    }
}