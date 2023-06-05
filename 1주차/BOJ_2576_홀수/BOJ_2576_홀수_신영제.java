package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1) 7번만큼 반복진행
2) 홀수일경우 계산
3) 짝수일경우 cnt 증가
4) cnt와 7과 비교하여 출력
 */
public class BOJ_2576_홀수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int FINAL = 7;
        int minNum = Integer.MAX_VALUE;
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < FINAL; i++) {
            int num = Integer.parseInt(br.readLine());
            // 홀수일 경우 합, 최소값 구하기.
            if (num % 2 == 1) {
                sum += num;
                minNum = Math.min(minNum, num);
            }
            else cnt++; // 짝수일경우 cnt 증가

        }
        // cnt가 7과 동일하다면 홀수가 없다는 의미이므로 -1출력
        if (cnt == FINAL) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minNum);

        }

    }
}
