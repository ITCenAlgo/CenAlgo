package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. sum에 값을 더해준다.
2. max에 값들을 비교하며 최대값을 선별
3. 최대값을 갖고 새로운 평균 출력
 */
public class BOJ_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());

        double max = Integer.MIN_VALUE;
        double sum = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());

            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        double avg = (((sum/max)*100.0)/N);

        System.out.println(avg);
    }
}
