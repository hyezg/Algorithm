class Solution {
    fun solution(phone_number: String): String {
        if (phone_number.length <= 4) {
            return phone_number
        }

        val lastFourDigits = phone_number.substring(phone_number.length - 4)
        val maskedPart = "*".repeat(phone_number.length - 4)

        return "$maskedPart$lastFourDigits"
    }
}