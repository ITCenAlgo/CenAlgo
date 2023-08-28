package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110_더하기사이클 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = num;
        int cnt = 0;

        while (true){

            // 주어진 입력값 분할
            int front = sum / 10;
            int back = sum % 10;

            // 분할한 값을 갖고 새로운 값 갱신
            int solv = front + back;

            // 규칙에 따라 뒤의 값과 새로운값의 1의자리를 더해 sum 갱신
            sum = (back*10) + (solv%10);

            cnt ++;
            // sum과 입력값이 같다면 종료
            if (sum == num) break;
        }
        System.out.println(cnt);


    }
}