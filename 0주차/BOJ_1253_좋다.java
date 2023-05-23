package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253_좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i=0; i < N; i++){
            int start = 0;
            int end = N-1;
            int find = arr[i];

            while (start < end){
                if (arr[start] + arr[end] == find){
                    if (start != i && end != i){
                        count ++;
                        break;
                    } else if (start == i) start ++;
                    else end --;
                }else if (arr[start] + arr[end] > find) end --;
                else start ++;
            }
        }
        System.out.println(count);
    }
}
