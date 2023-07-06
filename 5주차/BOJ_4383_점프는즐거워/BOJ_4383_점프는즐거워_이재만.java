import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer answer = new StringBuffer();
        String s;
        Loop1:
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            boolean[] check = new boolean[n];                   // 1 ~ n-1 을 체크할 배열
            int prev = Integer.parseInt(st.nextToken());        // 비교할 두 수 중 앞의 숫자
            while (st.hasMoreTokens()) {
                int next = Integer.parseInt(st.nextToken());        // 비교할 두 수 중 뒤의 숫자
                int dif = Math.abs(prev - next);                    // 차이를 dif 에 저장
                if (dif == 0 || n <= dif || check[dif]) {           // 1 ~ n - 1 을 벗어나거나 이미 나온 차이이면
                    answer.append("Not jolly\n");                       // Jolly 가 아님
                    continue Loop1;                                     // 다음 케이스로 넘어감
                }
                prev = next;                                        // 앞의 숫자를 업데이트
                check[dif] = true;                                  // 현재 차이를 저장
            }
            answer.append("Jolly\n");                           // 반복문을 성공적으로 끝내면 Jolly
        }
        System.out.println(answer);
    }
}
