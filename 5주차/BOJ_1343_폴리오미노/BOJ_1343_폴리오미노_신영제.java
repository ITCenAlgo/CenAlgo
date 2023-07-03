package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 문자열 전체를 입력받는다.
2. XXXX가 있다면 AAAA로 변환시킨다.
3. 변환 후 XX가 있다면 BB로 변환시킨다.
 */
public class BOJ_1343_폴리오미노 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String poll = br.readLine();

        poll = poll.replaceAll("XXXX", "AAAA");
        poll = poll.replaceAll("XX","BB");

        if(poll.contains("X")) System.out.println("-1");
        else System.out.println(poll);
    }

}
