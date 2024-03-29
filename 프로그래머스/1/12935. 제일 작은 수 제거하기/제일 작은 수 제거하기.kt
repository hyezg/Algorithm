class Solution {
    fun solution(arr: IntArray): IntArray {
        var min = arr.minOrNull()
        var mutablelist = arr.toMutableList()

        mutablelist.remove(min)

        if (mutablelist.size == 0) {
            mutablelist.add(-1)
        }

        return mutablelist.toIntArray()
    }
}