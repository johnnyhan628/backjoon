package programmers;

import java.util.Arrays;

public class Q43238 {
  public long solution(int n, int[] times) {
    long answer = Long.MAX_VALUE;
    
    Arrays.sort(times);
    
    int start = times[0];
    int end = times[times.length - 1] * n;
    int mid;
    int sum = 0;
    
    while(start <= end){
        mid = (start + end) / 2;
        sum = 0;
        
        for(int i = 0; i<times.length; i++){
            sum += mid/times[i];
        }
        
        if(sum >= n){
            answer = Math.min(answer, mid);
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    
    return answer;
  }
}
