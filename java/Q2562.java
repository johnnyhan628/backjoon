import java.io.*;
import java.util.*;
public class Q2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[9];
        
        for(int i=0; i<9; i++){
            int k = Integer.parseInt(br.readLine());
            map.put(k, i);
            arr[i] = k;            
        }

        Arrays.sort(arr);
        System.out.println(arr[8]);
        System.out.print(map.get(arr[8])+1);
    }
}
