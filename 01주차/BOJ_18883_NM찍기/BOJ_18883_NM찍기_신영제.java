package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1) N * M 만큼 반복문 진행
2) 나머지가 0일 경우 M의 배수이므로 다음줄 진행
 */
public class BOJ_18883_NM찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(); // 문자열 변환 후 삽입

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N * M; i++) {
            // M의 배수일 경우 다음줄로 변환
            if (i % M == 0) {
                sb.append(i).append("\n");
            } else {
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }

}