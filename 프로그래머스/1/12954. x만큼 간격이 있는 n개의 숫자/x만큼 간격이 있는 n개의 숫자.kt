class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        
         var xLong = x.toLong()

        for (i in 0 until n) {
            answer[i] = xLong
            xLong += x
        }

        return answer
    }
}