import java.io.*;

public class Q2018 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = i + 1;
    }

    int cnt = 0;
    int k = 0;
    while (k < N) {
      int sum = 0;
      for (int i = k; i < N; i++) {
        if (sum < N) {
          sum += arr[i];
          if (sum == N) {
            cnt++;
            break;
          }
        } else if (sum == N) {
          cnt++;
          break;
        } else {
          break;
        }
      }
      k++;
    }
    System.out.print(cnt);
  }
}
