fun main() {

    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
    println(isPalindrome(937487))
}