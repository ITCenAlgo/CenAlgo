package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
1. REV 함수 생성 후 Reverse를 통해 뒤집고 정수형으로 바꿔준다.
2. 한번에 출력
 */
public class BOJ_1357_뒤집힌덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(REV(REV(X) + REV(Y)));
    }

    private static int REV(int num) {
        StringBuilder sb = new StringBuilder(num + "");
        return Integer.parseInt(sb.reverse().toString());
    }
}
