package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399_ATM {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 사람의 수
		int[] tmp = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(tmp); // 오름차순 정렬
		
		int sum = 0; // 총 합계
		int pre = 0; // 앞 사람까지 더한 합계
		
		for(int i=0; i<tmp.length; i++) {
			sum += pre + tmp[i]; // 총 합계 = 앞사람까지의 합 + 해당하는 사람의 대기 시간
			pre += tmp[i]; 
		}
		System.out.println(sum);
	}

}
