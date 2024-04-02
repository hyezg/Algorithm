class Solution {
    fun solution(s: String): String {
        var answer = ""
        var slist = s.toMutableList()
        var listSize = slist.size
        var  list2= listSize/2

        if (listSize % 2 != 0) {
            answer += slist[list2]
        } else {
            answer += (slist[list2-1]).toString() +slist[list2]
        }

        return answer
    }
}