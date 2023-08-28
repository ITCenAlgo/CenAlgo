package src.algo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
/*
1. 합 배열과 시간List생성한다.
2. 오름차순 정렬하여 시간순으로 합을 sum에 더하여 최솟값을 출력.
 */
public class BOJ_11399_ATM {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        Collections.sort(list);

        int[] arr = new int[N];
        int sum = 0;
        for (int i=0; i<list.size(); i++){
            if(i == 0){
                arr[i] = list.get(i);
                sum = list.get(i);
            } else {
                arr[i] = arr[i - 1] + list.get(i);
                sum += arr[i];
            }
        }
        System.out.println(sum);


    }
}
