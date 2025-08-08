package programmers;

public class Q42842 {
  public int[] solution(int brown, int yellow) {
    int N = brown + yellow;
    int a = N; int b = 1;
    int maxDiff = 2000000;
    
    for(int i=1; i<=Math.sqrt(N); i++){
        if(N % i == 0){
            int j = N / i;
            int max = Math.max(i, j);
            int min = Math.min(i, j);
            int diff = max - min;
            if(diff < maxDiff){
                a = max; b = min;
                maxDiff = diff;
            }
        }
    }
    
    int[] answer = {a, b};
    return answer;
  }
}
