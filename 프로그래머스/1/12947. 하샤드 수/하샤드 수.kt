class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var result = x.toString().map { it.toString().toInt()} .toIntArray()
        if(x % result.sum() == 0){
            answer = true
        } else {
            answer = false
        }
        return answer
    }
}