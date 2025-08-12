import java.util.*;
import java.io.*;
public class Q10845 {
    public static void main(String[] args) throws IOException{
        /*
         * 오늘 낮에 스택을 풀었을 때는 BufferedReader + System.out.println + for loop + if문을 이용해서 풀이했으니,
         * 이번에는 BufferedReader + StringBuilder + while + swith case문을 이용해서 풀어보자.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while(N -- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd) {
                case "push":
                    push(list, Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop(list) + "\n");
                    break;

                case "size":
                    size(list);
                    sb.append(size(list) + "\n");
                    break;

                case "empty":
                    empty(list);
                    sb.append(empty(list) + "\n");
                    break;

                case "front":
                    front(list);
                    sb.append(front(list) + "\n");
                    break;

                case "back":
                    back(list);
                    sb.append(back(list) + "\n");
                    break;
            }
        }
        System.out.print(sb);
    }

    static void push(ArrayList<Integer> list, int k){
        list.add(k);
    }

    static int pop(ArrayList<Integer> list){
        if(list.size() == 0){
            return -1;
        }
        int p = list.get(0);
        list.remove(0);
        return p;
    }

    static int size(ArrayList<Integer> list){
        return list.size();
    }

    static int empty(ArrayList<Integer> list){
        if(list.size() > 0){
            return 0;
        }
        return 1;
    }

    static int front(ArrayList<Integer> list){
        if(list.size() == 0){
            return -1;
        }
        return list.get(0);
    }

    static int back(ArrayList<Integer> list){
        if(list.size() == 0){
            return -1;
        }
        return list.get(list.size()-1);
    }

}
