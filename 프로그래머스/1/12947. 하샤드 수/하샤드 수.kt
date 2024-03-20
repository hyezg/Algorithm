class Solution {
    fun solution(x: Int): Boolean {
       
        var sum = x.toString()
                    .map { it.toString().toInt() } 
                    .toIntArray()
                    
        return x % sum.sum() == 0
    }
}