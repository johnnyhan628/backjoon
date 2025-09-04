import java.io.*;
import java.util.*;

public class Q2606_copy {
    static List<List<Integer>> gragh; // 인접 리스트
    static boolean[] visited; // 방문체크
    static int count = 0; // 감염된 컴퓨터 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 전체 인덱스의 개수
        int m = Integer.parseInt(br.readLine()); // 연결 수

        // 그래프 값 초기화
        gragh = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            gragh.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];

        // 연결 정보 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            gragh.get(a).add(b);
            gragh.get(b).add(a);
        }

    }

    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : gragh.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
