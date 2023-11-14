// 다른 사람 풀이
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 =0;
        int num = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max1){
                max1 = numbers[i];
                num = i;
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(i==num)continue;
            if(numbers[i]>max2&&numbers[i]<=max1){
                max2 = numbers[i];
            }
        }
        answer = max1 * max2;
        return answer;
    }
}
