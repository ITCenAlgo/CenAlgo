package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 전체 사탕의 갯수 구하기.
2. +2 하면서 개인 사탕 갯수 구하기
 */
public class BOJ_1812_사탕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] candy = new int[N];
        int[] solv = new int[N];
        int sum = 0;

        for (int i=0; i<N; i++){
            candy[i] = Integer.parseInt(br.readLine());
            sum += candy[i];
        }

        sum /= 2;

        for(int i=0; i<N; i++){
            int tot = 0;

            for(int j=0; j<N; j +=2){
                tot += candy[(i+j)%N];
                solv[i] = tot-sum;
            }
            System.out.println(solv[i]);
        }

    }
}
