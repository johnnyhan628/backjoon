import java.io.*;
import java.util.*;
public class Q1546 {

  /**
   ** 문제 푸는 순서
   * 1. 입력받은 배열 중 최댓값을 고름(M)
   * 2. 모든 점수의 값을 수정함
   * 3. 그리곤 다시 평균을 냄
   */

  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];

    for(int i=0; i<N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    double sum = 0;
    for(int i=0; i<N; i++){
      sum += (double) arr[i]/arr[N-1];
    }

    double result = sum/N*100;
    System.out.print(result);
  }
}
