import java.io.*;
import java.util.*;

public class Q10871 {
  public static void main(String[] args) throws IOException{
    /*
     *  *문제 분석
     * 수열 A와 정수 X. A에서 X보다 작은 수를 모두 출력.
     * 
     *  *풀이
     * 1. 수열과 정수 받기
     * 2. 수열을 반복하면서 어짜피 st에서 int로 변환할 때 루프를 도니까 그 때에 X랑 비교하기
     * 3. 비교한 값을 ArrayList에 넣기
     * 4. StringBuilder에 담아 출력하기
     *
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    StringTokenizer arrSt = new StringTokenizer(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    for(int i=0; i<N; i++){
      int k = Integer.parseInt(arrSt.nextToken());
      if(k < X){
        list.add(k);
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<list.size(); i++){
      sb.append(list.get(i));
      if(i<list.size()-1){
        sb.append(" ");
      }
    }

    System.out.print(sb);
  }
}
