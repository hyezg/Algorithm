class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        var a:Double = num1.toDouble()
        var b : Double = num2.toDouble()
        answer = (a/b * 1000).toInt()
        return answer
    }
}