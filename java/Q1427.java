import java.io.*;
import java.util.*;

/*
 * 문자열 그대로 받고
 * 하나씩 끊어서 배열로 생성
 * Arrays.sort로 정렬하되 반대방향으로 정렬
 * StringBuilder로 배열 순회하면서 공백없이 넣고 출력
 */
public class Q1427 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    String[] arr = N.split("");

    Arrays.sort(arr, Comparator.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }

    System.out.print(sb);

  }
}
