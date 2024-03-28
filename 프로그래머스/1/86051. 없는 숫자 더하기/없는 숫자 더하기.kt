class Solution {
    fun solution(numbers: IntArray): Int {
        var sum: Int = 0

        for (i in 0..9) {
            if (!numbers.contains(i)) {
                sum += i
            }
        }

        return sum
    }
}