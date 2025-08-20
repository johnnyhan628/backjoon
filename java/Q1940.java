import java.io.*;
import java.util.*;
public class Q1940 {
  /*
   * 이번에는 투포인터로 풀어보자.!
   * 배열 안의 두 수를 더해서 원하는 값(M)이 만들어지면 해당 두 수는 더이상 사용하면 안될텐데,
   * left++ right-- 하고
   * 작을 때는 더 큰 수가 필요하니 left++
   * 클 때는 더 작은 수가 필요하니 right--
   */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    String[] strArr = br.readLine().split(" ");
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    Arrays.sort(arr);
    int left = 0;
    int right = N-1;
    int cnt = 0;
    
    while (left < right) {
      int sum = arr[left] + arr[right];
      if(sum == M){
        cnt++;
        left++;
        right--;
      }else if(sum > M){
        right --;
      }else{
        left++;
      }
    }

    System.out.print(cnt);

  }
}
