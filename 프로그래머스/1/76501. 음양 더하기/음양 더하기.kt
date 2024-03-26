class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        for(i in signs.indices){
            if(signs[i] == false){
                absolutes[i] = - absolutes[i]
            }
            answer += absolutes[i]
        } 
        return answer 
    }
}