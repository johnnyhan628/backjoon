import java.io.*;

/*
 * 연속된 부분합을 구하는 중 길이가 가장 짧은 것...
 * 연속합을 슬라이딩하면서 연속합이 S 이상인 left와 right 길이(right-left+1)를 구하고 그 길이를 min으로 저장. 그리고 cnt++
 * min을 출력하고 cnt가 여전히 0이면 0출력하면서 마무리
 */
public class Q1806 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] a = br.readLine().split(" ");
    int N = Integer.parseInt(a[0]);
    int S = Integer.parseInt(a[1]);

    String[] arrStr = br.readLine().split(" ");
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(arrStr[i]);
    }

    int left = 0;
    int right = 0;
    int sum = 0;
    int min = Integer.MAX_VALUE;

    while (true) {
      if (sum >= S) {
        min = Math.min(min, right - left);
        sum -= arr[left++];
      } else {
        if (right == N) {
          break;
        }
        sum += arr[right++];
      }
    }
    if (min == Integer.MAX_VALUE) {
      System.out.print(0);
    } else {
      System.out.print(min);
    }
  }
}
