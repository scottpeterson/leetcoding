package easy

fun main() {
    fun romanToInt(s: String): Int {

        val dataMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var finalValue = 0

        for (i in s.indices) {
            val currentValue = dataMap.getValue(s[i])

            if (i + 1 != s.length) {
                val nextValue = dataMap.getValue(s[i + 1])
                if (currentValue < nextValue) {
                    finalValue -= currentValue
                } else {
                    finalValue += currentValue
                }
            } else {
                finalValue += currentValue
            }
        }
        return finalValue
    }

    println(romanToInt("XIV"))
}