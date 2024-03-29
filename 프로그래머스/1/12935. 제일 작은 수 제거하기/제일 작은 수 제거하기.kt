class Solution {
    fun solution(arr: IntArray): IntArray {
        var min = arr.minOrNull()
        var muar = arr.toMutableList()

        if (muar.contains(min)) {
            muar.remove(min)
        } else if (muar.size == 1 && muar[0] == 10) {
            muar.add(-1)
        }


        return muar.toIntArray()
    }
}