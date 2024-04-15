class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var range = left..right

        for (n in range) {
            var count = 0

            for (i in 1..n) {
                if (n % i == 0) {
                    count++
                }
            }
            if (count % 2 == 0) {
                answer += n
            } else {
                answer -= n
            }
        }

        return answer
    }
}