class Solution {
    fun solution(n: Int): Int {
       
        var answer = 0
        var result = n.toString().toCharArray()
        for(i in result) {
            answer += i.toString().toInt()
        }
        
        return answer
    }
}