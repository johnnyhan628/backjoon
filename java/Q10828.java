import java.io.*;
import java.util.*;
public class Q10828 {
  /*
   * *문제 풀이
   * - 스택은 list로 나타낸다(왜냐? 인덱스가 존재하고 가변적이기 때문이다.)
   * - br과 st를 생성하고 각 명령별로 메서드를 생성한다.
   * - 원하는 결과값을 출력한다... 끝~
   */
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> stack = new ArrayList<>();
    
    for(int i=0; i<N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();
      if(cmd.equals("push")){
        push(stack, Integer.parseInt(st.nextToken()));
      }else if(cmd.equals("pop")){
        System.out.println(pop(stack));
      }else if(cmd.equals("size")){
        System.out.println(size(stack));
      }else if(cmd.equals("empty")){
        System.out.println(empty(stack));
      }else if(cmd.equals("top")){
        System.out.println(top(stack));
      }
    }
  }
  static ArrayList<Integer> push(ArrayList<Integer> stack, Integer k){
    stack.add(k);
    return stack;
  }

  static Integer pop(ArrayList<Integer> stack){
    if (stack.size()==0){
      return -1;
    }else{
      int k = stack.get(stack.size()-1);
      stack.remove(stack.size()-1);
      return k;
    }
  }

  static Integer size(ArrayList<Integer> stack){
    return stack.size();
  }

  static Integer empty(ArrayList<Integer> stack){
    if (stack.size()==0){
      return 1;
    }else{
      return 0;
    }
  }

  static Integer top(ArrayList<Integer> stack){
    if (stack.size()==0){
      return -1;
    }else{
      return stack.get(stack.size()-1);
    }
  }
}
