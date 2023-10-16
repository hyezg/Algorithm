import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);  //배열 오름차순 정렬
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
