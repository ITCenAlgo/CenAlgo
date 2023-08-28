package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047_동전0_이미지 {
	public static int[] arr;	
	public static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int idx = 0;
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] <= K)
				idx = i;
		}

		System.out.println(greedy(idx, K));
	}
	
	public static int greedy(int idx, int K) {
		cnt += K / arr[idx]; //개수
		K %= arr[idx]; //남은 가치
		
		if(K == 0) 
			return cnt;
		
		return greedy(--idx, K);
	}
}
