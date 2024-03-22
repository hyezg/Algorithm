class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        
        for ((index, value) in seoul.withIndex()) {
            if( value == "Kim") {
                answer ="김서방은 ${index}에 있다"
            }   
        }
        
        return answer
    }
}