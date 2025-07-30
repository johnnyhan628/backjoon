import java.io.*;

public class Q17103 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(bf.readLine());

    int count = 0; //각 케이스의 count 초기화
    //T개의 테스트 수만큼 반복
    for(int i=0; i<T; i++){
      int N = Integer.parseInt(bf.readLine()); //짝수 값을 받음
      
      for(int prime1 = 2; prime1 <= N; prime1++){
        int prime2 = N-prime1;

        if(isPrime(prime1) && isPrime(prime2)){
          count++;
        }
      }
    }
    System.out.println(count);
  }

  public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
