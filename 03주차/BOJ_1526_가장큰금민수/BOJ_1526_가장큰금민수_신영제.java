package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 입력받은 숫자로부터 1씩 줄여가며 반복문 진행
2. 문자열로 변환하여 4와 7이 자릿수만큼 cnt가 증가
3. cnt와 문자열길이를 비교하여 일치하다면 가장 큰 값 출력.
 */
public class BOJ_1526_가장큰금민수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            
            String check = String.valueOf(i);
            int cnt = 0;

            for (int j = 0; j < check.length(); j++) {
                if (check.charAt(j) == '4' || check.charAt(j) == '7') cnt++;
            }

            if (cnt == check.length()) {
                System.out.println(check);
                break;
            }

        }
    }
}
