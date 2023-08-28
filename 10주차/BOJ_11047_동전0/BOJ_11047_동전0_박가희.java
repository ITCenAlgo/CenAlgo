package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047_동전0 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			coin[i] = Integer.parseInt(br.readLine()); //동전 입력
		}
		
		for(int i=N-1; i>0; i--) { // 값이 큰 동전 부터 내림차순으로 비교
			if(coin[i] <= K) { // 동전의 값이 입력한 값보다 크지 않을 때
				cnt += K / coin[i]; // 입력한 값 / 동전의 값 -> cnt
				K %= coin[i]; // 나머지를 K로 다시 대입
			}
		}
		
		System.out.println(cnt);
	}
}
