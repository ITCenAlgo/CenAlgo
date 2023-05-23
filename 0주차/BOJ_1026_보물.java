package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_1026_보물 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arrA, arrB));
    }

    private static int solution(int n, int[] arrA, int[] arrB) {
        int answer = 0;
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for (int i=0; i<n; i++){
            answer += arrA[i] * arrB[n-1-i];
        }
        return answer;
    }
}
