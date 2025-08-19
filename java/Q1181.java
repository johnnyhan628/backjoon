import java.io.*;
import java.util.*;

public class Q1181 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Set<String> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      set.add(br.readLine());
    }

    String[] arr = set.toArray(new String[0]);

    Arrays.sort(arr, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i] + "\n");
    }

    System.out.print(sb);
  }
}
