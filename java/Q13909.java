import java.io.*;

public class Q13909 {
    /**
     * 문제 분석이 잘못됨...
     * 약수의 수가 홀수인 숫자들만 더하면 됨
     * 약수의 수가 홀수인 숫자는 제곱수로 표현할 수 있는 수 밖에 없음.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        for(int i=1; i*i<=N; i++){
            count++;
        }
        bw.write(count);
    }
}
