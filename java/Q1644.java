import java.io.*;
/*
 * 1644 소수의 연속합
 * 투 포인터 + 소수판별
 * 그 자체가 소수면 cnt++
 */
public class Q1644 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = 2; // 첫번째 수
        int sum = 0; // 합을 구할 수
        int cnt = 0; // return 을 담을 counter
        while(k <= N){
            if(isPrime(k) && k == N){
                cnt++;
            }else if(isPrime(k)){
                sum += k;
                if(sum == N){
                    cnt ++;
                    sum = 0;
                }else if(sum > N){
                    sum = 0;
                }
            }
            k++;
        }
        System.out.println(cnt);
    }
    
    //소수판별 함수
    static boolean isPrime(int k){
        if(k < 2){
            return false;
        }

        for(int i=2; i<=Math.sqrt(k); i++){
            if(k % i == 0){
                return false;
            }
        }
        return true;
    }
}

