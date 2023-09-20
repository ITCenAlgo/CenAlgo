package BOJ_11047_동전;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//메모리 : 14276KB  시간 : 128ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 동전 갯수 
		int K = Integer.parseInt(st.nextToken());	// K값 
		
		int[] A = new int[N];
		
		// 동전의 가치 A 저장 
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		
		// 배열을 거꾸로 조회해서 내림차순으로 동전 조회 
		for(int i = N - 1; i >= 0; i--) {
 
			// 현재 동전의 값이 K보다 작거나 같을때를 체크 
			if(A[i] <= K) {
				// 현재 동전 값으로 K값을 구성할 수 있는 최대 갯수 저장 
				cnt += (K / A[i]);
				K = K % A[i];
			}
		}
		System.out.println(cnt);
	}
}
