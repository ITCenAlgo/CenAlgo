package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. K 와 같거나 작을경우 해당 금액과 K를 나누어 몫(카운트) 를 더해준다.
2. 이후 K와 해당금액을 나누어 K를 갱신하여 반복
 */
public class BOJ_11047_동전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=N-1; i>=0; i--){
            if( K >= arr[i]){
                count += K / arr[i];
                K = K%arr[i];
            }
        }
        System.out.println(count);
    }
}
