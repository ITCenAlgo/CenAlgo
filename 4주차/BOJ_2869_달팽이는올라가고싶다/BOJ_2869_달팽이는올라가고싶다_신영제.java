package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. 달팽이가 정상에 도달했다 가정
2. 나머지값이 있다면 정상에 도달하지 못했으니깐 +1 해준다.
 */
public class BOJ_2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int downDay = V - B;
        int upDay = A - B;

        // 달팽이 정상 도달했다 가정
        int endDay = downDay / upDay;

        // 블록 남아있을 경우
        if((downDay % upDay) != 0) endDay++;

        System.out.println(endDay);

    }
}
