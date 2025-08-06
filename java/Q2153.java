import java.io.*;

public class Q2153 {
  public static void main(String[] args) throws IOException{
    /*
     * 0. 알파벳을 숫자로 어떻게 표현하면 좋을까?
     * 1. 단어를 받는다.
     * 2. 각 단어를 쪼개서 합한다.
     * 3. 소수인지 판단한다.
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

    int count = 0;
    char[] chars = s.toCharArray();

    for(char c : chars){
      count = count + changeInteger(c);
    }

    if(isPrime(count)){
      System.out.print("It is a prime word.");
    }else{
      System.out.print("It is not a prime word.");
    }
  }

  public static boolean isPrime(int n){
    if(n == 1) return true;
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i == 0) return false;
    }
    return true;
  }

  public static int changeInteger(char k){
    if(k >= 'a' && k <= 'z'){
      return k - 'a' + 1;
    }else if(k >= 'A' && k <= 'Z'){
      return k - 'A' + 27;
    }else throw new IllegalArgumentException();
  }
}
