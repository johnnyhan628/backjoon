import java.io.*;
import java.util.*;
/*
 * 1644 소수의 연속합
 * 소수 배열 -> 에스토라스의 체
 * 소수 배열을 순회 -> 슬라이딩 투포인터
 */
public class Q1644 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeList = isPrime(N);
        int left = 0; int right = 0;
        int sum = 0; int cnt = 0;

        while(true){
            if(sum >= N){
                if(sum == N){
                    cnt++;
                }
                if(left == primeList.size()){
                    break;
                }
                sum = sum - primeList.get(left++);
            }else {
                if(right == primeList.size()){
                    break;
                }
                sum = sum + primeList.get(right++);
            }
        }
        System.out.print(cnt);
    }
    
    static ArrayList<Integer> isPrime(int N){
        boolean[] arr = new boolean[N+1]; // 0부터 N까지의 인덱스가 존재하는 배열 생성
        Arrays.fill(arr, true); // arr의 모든 인덱스 값을 true로 일단 채움
        arr[0] = arr[1] = false; //어짜피 0이랑 1은 소수 아님

        //아래 루프는 그냥 외워라 내가 이해할 수 있는 범위가 아님
        for(int i=2; i<= i*i; i++){
            if(arr[i]){
                for(int j=i*i; j<=N; j+=i){
                    arr[j] = false;
                }
            }
        }

        // true인 애들만 담음
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=N; i++){
            if(arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}

