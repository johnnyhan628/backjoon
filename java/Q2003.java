import java.io.*;

public class Q2003 {

  /*
   * 수열의 길이 N
   * i번째부터 j번째까지의 합이 M이 되는 경우의 수
   * 
   * 부분합으로 구해보자
   */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr1 = br.readLine().split(" ");
    String[] arr2 = br.readLine().split(" ");

    int N = Integer.parseInt(arr1[0]);
    int M = Integer.parseInt(arr1[1]);
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(arr2[i]);
    }

    int cnt = 0;

    for (int i = 0; i < N; i++) {
      int sum = 0; // 임시로 값을 저장할 수
      for (int j = i; j < N; j++) {
        sum += arr[j];
        if (sum == M) {
          cnt++;
        }
      }
    }

    System.out.print(cnt);
  }
}
