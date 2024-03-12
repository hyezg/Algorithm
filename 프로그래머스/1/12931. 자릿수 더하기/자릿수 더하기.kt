class Solution {
    fun solution(n: Int): Int {
       
        var answer = 0
        var nStr = n.toString()
        for(i in nStr) {
            answer += i.toString().toInt()
        }
        
        return answer
    }
}
