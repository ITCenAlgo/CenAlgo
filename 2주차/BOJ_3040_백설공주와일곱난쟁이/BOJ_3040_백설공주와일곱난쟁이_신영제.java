package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 9명의 난쟁이들의 전체합 구하기
2. 한명씩 모두 돌아가면서 100되는지 확인후 출력
 */

public class BOJ_3040_백설공주와일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 9;
        int[] arr = new int[N];

        int sum = 0;
        // 9명 난쟁이 번호 입력 받기.
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 난쟁이들 합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 전체 더한값에서 가짜난쟁이 빼기
                if (sum - (arr[i] + arr[j]) == 100) {
                    for (int k = 0; k < N; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(arr[k]);
                    }
                }
            }
        }
    }
}
