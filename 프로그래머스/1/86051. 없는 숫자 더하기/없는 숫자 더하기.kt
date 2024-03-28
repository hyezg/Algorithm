class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var i: IntArray

        for (i in 0..9) {
            if (!numbers.contains(i)) {
                answer += i
            }
        }

        return answer
    }
}