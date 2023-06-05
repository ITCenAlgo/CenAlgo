package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) 9번 반복문 진행
2) 반복하면서 값 비교
3) 최대값과 현재 자리수가 동일하다면 n번째값을 maxCnt에 삽입
 */
public class BOJ_2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int FINAL = 9;
        int maxNum = Integer.MIN_VALUE;
        int maxCnt = 0;

        for (int i = 1; i <= FINAL; i++) {
            int num = Integer.parseInt(br.readLine());
            // 최댓값 구하는 함수
            maxNum = Math.max(maxNum, num);
            // 최댓값 변수와 입력한 변수가 같다면 i값 자리수 삽입
            maxCnt = maxNum == num ? i : maxCnt;
        }
        System.out.println(maxNum);
        System.out.println(maxCnt);

    }
}
