import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for (int i = N - 1; i >= 0; i--) {                  // 입력되는 동전의 종류를 내림차순으로 저장
            coin[i] = Integer.parseInt(br.readLine());
        }
        int answer = 0;
        for (int c : coin) {                                // 큰 동전부터 최대한 사용하여 K를 만듬
            answer += K / c;
            K %= c;
        }
        System.out.println(answer);
    }
}
