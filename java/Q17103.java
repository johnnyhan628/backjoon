import java.io.*;

public class Q17103 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(bf.readLine()); // 테스트 할 개수

    for(int i=0; i<T; i++){
      int N = Integer.parseInt(bf.readLine()); // 테스트 할 수 

      int count = 0; // 맞는 개수를 셀 count 초기화

      for(int prime1 = 2; prime1 <= N/2; prime1++){
        int prime2 = N-prime1;

        if(isPrime(prime1)){
          if(isPrime(prime2))
          count++;
        }
      }
      System.out.println(count);
    }
  }

  public static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
  }
}
