class FizzBuzz {
    fun say(input: Int): String {
        val fizzbuzz = "${getFizz(input)}${getBuzz(input)}"
        val isFizzOrBuzz = fizzbuzz.isNotEmpty()
        val mapper = hashMapOf(1 to fizzbuzz)
        return mapper[isFizzOrBuzz.toInt()] ?: input.toString()
    }

    private fun getFizz(input: Int): String {
        val isFizz = input % 3 == 0
        return "Fizz".repeat(isFizz.toInt())
    }

    private fun getBuzz(input: Int): String {
        val isBuzz = input % 5 == 0
        return "Buzz".repeat(isBuzz.toInt())
    }
}

fun Boolean.toInt(): Int {
    val mapper = hashMapOf(true to 1)
    return mapper[this] ?: 0
}