//시도
class Solution {
  int answer = 0;
        int max = 0;
        int sec = 0;
        
        //max 찾기!
        for(int i=0; i<numbers.length; i++)  {
            if(numbers[i] > max)    {
                max = numbers[i];
            }
        }
        //sec 찾기
        for(int i=0; i < numbers.length; i++)  {
            if(numbers[i] < max && numbers[i] > sec)  {
                sec = numbers[i];
            }
            else if(i == max.length){
                  sec =numbers[i];
            }
        }
        answer = max * sec;
}
