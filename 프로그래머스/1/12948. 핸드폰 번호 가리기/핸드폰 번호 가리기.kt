class Solution {
    fun solution(phone_number: String): String {
        if (phone_number.length <= 4) {
            return phone_number
        }

        val lastFour = phone_number.substring(phone_number.length - 4)
        val star = "*".repeat(phone_number.length - 4)

        return "$star$lastFour"
    }
}