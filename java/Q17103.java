import java.io.*;

public class Q17103 {
  static final int MAX = 1000000;
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        boolean[] isPrime = getPrimeArray(MAX);

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(bf.readLine());
            int count = 0;

            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
  }

  public static boolean[] getPrimeArray(int n) {
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) isPrime[i] = true;

    for (int i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    return isPrime;
  }
}
