
class Solution {
    fun solution(n: Int): String {
        var answer1 = "수"
        var answer2 = "박"
        var answer =""

        if(n %2!=0){
            for(i in 0 until (n/2)) answer += "수박"
            answer += "수"
        } else {
            for(i in 0 until (n/2)) answer += "수박"
        }
        return answer
    }
}