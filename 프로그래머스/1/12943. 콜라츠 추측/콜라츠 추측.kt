class Solution {
    fun solution(num: Int): Int {
        var n:Long = num.toLong()
        var ct:Int = 0

        while(n != 1L) {
            if (ct == 500) {
                return -1
            }
            if (n % 2 == 0L) {
                n /= 2

            } else {
                n = n * 3 + 1
            }
            ct++
        }
        if(num == 1){
            return 0
        }

        return ct
    }
}