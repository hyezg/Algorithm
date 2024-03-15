class Solution {
    fun solution(n: Long): Long {
        val answer = n.toString().toCharArray().sortedDescending().joinToString("")
        return answer.toLong()
    }
}