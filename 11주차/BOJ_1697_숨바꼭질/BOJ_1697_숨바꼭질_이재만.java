import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> Q = new ArrayDeque<>();
        Q.add(N);
        int[] point = new int[100001];
        point[N] = 1;
        while (Q.peek() != K) {                                     // BFS
            int n = Q.poll();
            for (int x : new int[] {n - 1, n + 1, n * 2}) {             // 1초동안 갈 수 있는 좌표들 탐색
                if (0 <= x && x < 100001 && point[x] == 0) {                // 범위가 0 ~ 100000이고 한번도 간적이 없는곳이면
                    Q.add(x);                                                   // Queue에 넣어주고 몇초가 걸렸는지 기록
                    point[x] = point[n] + 1;
                }
            }
        }
        System.out.println(point[K] - 1);
    }
}
