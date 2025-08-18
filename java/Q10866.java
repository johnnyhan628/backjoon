import java.io.*;
import java.util.*;

public class Q10866 {
  public static void main(String[] args) throws IOException {
    /**
     * 앞 뒤로 값이 들어가야하니까 LinkedList를 사용해보자.
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    LinkedList<Integer> list = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();

      switch (cmd) {
        case "push_front":
          push_front(list, Integer.parseInt(st.nextToken()));
          break;

        case "push_back":
          push_back(list, Integer.parseInt(st.nextToken()));
          break;

        case "pop_front":
          sb.append(pop_front(list) + "\n");
          break;

        case "pop_back":
          sb.append(pop_back(list) + "\n");
          break;

        case "size":
          sb.append(size(list) + "\n");
          break;

        case "empty":
          sb.append(empty(list) + "\n");
          break;

        case "front":
          sb.append(front(list) + "\n");
          break;

        case "back":
          sb.append(back(list) + "\n");
          break;
      }
    }
    System.out.print(sb);

  }

  static void push_front(LinkedList<Integer> list, int k) {
    list.addFirst(k);
  }

  static void push_back(LinkedList<Integer> list, int k) {
    list.addLast(k);
  }

  static int pop_front(LinkedList<Integer> list) {
    if (list.size() == 0) {
      return -1;
    }
    int num = list.getFirst();
    list.removeFirst();
    return num;
  }

  static int pop_back(LinkedList<Integer> list) {
    if (list.size() == 0) {
      return -1;
    }
    int num = list.getLast();
    list.removeLast();
    return num;
  }

  static int size(LinkedList<Integer> list) {
    return list.size();
  }

  static int empty(LinkedList<Integer> list) {
    if (list.size() > 0) {
      return 0;
    }
    return 1;
  }

  static int front(LinkedList<Integer> list) {
    if (list.size() == 0) {
      return -1;
    }
    return list.getFirst();
  }

  static int back(LinkedList<Integer> list) {
    if (list.size() == 0) {
      return -1;
    }
    return list.getLast();
  }
}
