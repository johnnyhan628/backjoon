
import java.io.*;
import java.util.*;

public class Q17103 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    Boolean[] arr = new Boolean[N];
    for(int i=0; i<N; i++){
      arr[i] = false;
    }
    
    for(int i=1; i<=N; i++){
      for(int j=1; j<=N; j++){
        if(i*j < N){
          if(arr[i*j]){
            arr[i*j] = false;
          }else{
            arr[i*j] = true;
          }
        }
      }
    }

    int count = 0;
    for(int i=0; i<N; i++){
      if(arr[i]){
        count++;
      }
    }
    System.out.print(count);
  }
}
