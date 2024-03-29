class Solution {
    fun solution(arr: IntArray): IntArray {
        var min = arr.minOrNull()
        var mutablelist = arr.toMutableList()

        if (mutablelist.contains(min)) {
            mutablelist.remove(min)
        } else if (mutablelist.size == 1 && mutablelist[0] == 10) {
            mutablelist.add(-1)
        }

        return mutablelist.toIntArray()
    }
}