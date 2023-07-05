package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. n-1만큼 반복 돌면서 각 값의 절댓값 구한다.
2. 방문배열이 true, 절대값이 n과같거나 크거나, 1보다 작을 경우 Not jolly
3. if문을 통과했으면 해당 방문은 졸리점퍼
 */

public class BOJ_4383_점프는즐거워 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String solv;


        while ((solv = br.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(solv);
            int n = Integer.parseInt(st.nextToken());
            boolean flag = true;

            int[] arr = new int[3000];
            boolean[] visited = new boolean[3000];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n - 1; i++) {
                int abs = Math.abs(arr[i] - arr[i + 1]);

                if (visited[abs] || abs >= n || abs < 1) {
                    flag = false;
                    break;
                }

                visited[abs] = true;
            }

            if (flag) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}