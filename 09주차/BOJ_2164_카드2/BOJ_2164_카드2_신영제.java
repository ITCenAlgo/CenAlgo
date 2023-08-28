package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int check = 1;

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while (true){
            int num = 0;
            if(queue.size() == 1 || queue.isEmpty()) break;
            if(check % 2 == 1){
                queue.poll();
            } else if (check % 2 == 0) {
                num = queue.poll();
                queue.add(num);
            }
            check++;
        }

        System.out.println(queue.peek());
    }
}
/*
1. 카드가 한장 남을때 까지 반복문 진행.
2. 홀수번째 : 카드 버리기, 짝수번째 : 카드 밑으로 옮기기
 */