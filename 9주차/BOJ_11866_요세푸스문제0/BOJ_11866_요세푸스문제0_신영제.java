package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
1. queue가 비어있지 않을동안 반복
2. queue의 3번째일 경우 제거, 그렇지않으면 뒤에 추가해가며 반복
 */
public class BOJ_11866_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<= N; i++){
            queue.add(i);
        }

        sb.append("<");
        while(!queue.isEmpty()){
          cnt ++;
            if(cnt == K){
                sb.append(queue.poll());
                cnt = 0;
                if(queue.size() > 0) sb.append(", ");
            }else {
                queue.add(queue.poll());
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}