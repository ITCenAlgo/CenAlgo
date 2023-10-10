package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 1. 사각형 4분할
 2. CHECK 함수를 통해 색깔 탐색, 다음 칸 색이 다르다면 return
 3. 현재 값을 비교하여 해당 색 카운트 하며 반복.
 */
public class BOJ_2630_색종이만들기 {

    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static int[][] arr;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        input();
        COUNT(0, 0, N);
        output();
    }
    private static void input() throws IOException {
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void COUNT(int row, int col, int size) {
        if (CHECK(row, col, size)) {
            if (arr[row][col] == 0) white++;
            else blue++;
            return;
        }

        int checkSize = size / 2;
        COUNT(row, col, checkSize);
        COUNT(row, col + checkSize, checkSize);
        COUNT(row + checkSize, col, checkSize);
        COUNT(row + checkSize, col + checkSize, checkSize);
    }

    private static boolean CHECK(int row, int col, int size) {
        int color = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) return false;
            }
        }
        return true;
    }
    private static void output() {
        System.out.println(white);
        System.out.println(blue);
    }


}
