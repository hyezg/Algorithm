class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int j=0;    //j는 짝수
        int k=0;    //홀수
        for(int i=0; i<num_list.length; i++)    {
            if(num_list[i] %2 ==0)  {
                j++;
                answer[0] = j;
            }
            else {
                k++;
                answer[1] =k;
            }
        }
        return answer;
    }
}