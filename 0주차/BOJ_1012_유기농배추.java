package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012_유기농배추 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static boolean[][] visit; // 방문 배열
    static int N, M, K; // 입력
    static int[][] cabbagePatch; // 배추밭

    // 4방 탐색할 곳
    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int earthWorm = 0;
            input();
            System.out.println(readyBFS(earthWorm));
        } // end TestCase
    }
    private static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        cabbagePatch = new int[M][N];
        visit = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            cabbagePatch[row][col] = 1;
        }
    }

    private static int readyBFS(int cnt) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (cabbagePatch[i][j] == 1 && !visit[i][j]) {
                    BFS(i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }


    private static void BFS(int row, int col) {
        visit[row][col] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            for (int d = 0; d < 4; d++) {
                int dx = num[0] + dRow[d];
                int dy = num[1] + dCol[d];
                if (dx < M && dy < N && dx >= 0 && dy >= 0 && !visit[dx][dy] && cabbagePatch[dx][dy] == 1) {
                    visit[dx][dy] = true;
                    queue.add(new int[]{dx, dy});
                }
            }
        }
    }
}