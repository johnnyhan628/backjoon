import java.io.*;
import java.util.*;

/*
 * 연속된 부분합을 구하는 중 길이가 가장 짧은 것...
 * 슬라이딩 투포인터 -> 그러면 sorting을 반대로 하던가, 루프를 반대로 돌아서 sum하고 각 인덱스의 차 + 1 하면 되겠네
 */
public class Q1806 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] a = br.readLine().split("");
    int N = Integer.parseInt(a[0]);
    int S = Integer.parseInt(a[1]);

    String[] arrStr = br.readLine().split("");
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(arrStr[i]);
    }

    Arrays.sort(arr);

    int right = N - 1;
    int left = N - 1;
    int sum = 0;
    while (true) {
      if (S <= sum) {
        if (S == sum) {
          System.out.print(right - left + 1);
          break;
        }
        if()
        if (S < sum) {
          sum = -arr[right--];
        }
      }
    }
  }
}
