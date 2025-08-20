import java.io.*;

public class Q1940 {
  /*
   * 이번에는 투포인터로 풀어보자.!
   * 배열 안의 두 수를 더해서 원하는 값(M)이 만들어지면 해당 두 수는 더이상 사용하면 안될텐데,
   * 그러면 left ++ 하고 사용하면 안되는 수는 0으로 바꿔버리자.
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

    int left = 0;
    int right = N - 1;

    while (left > N - 1) {

    }

  }
}
