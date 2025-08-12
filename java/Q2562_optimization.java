import java.io.*;
public class Q2562_optimization {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<9; i++){
            int k = Integer.parseInt(br.readLine());
            if(k > max){
                max = k;
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.print(maxIndex+1);
    }
}
