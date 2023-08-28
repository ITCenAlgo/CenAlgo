package BOJ_11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 메모리 : 14428KB  시간 : 132ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] P = new int[N];	// 인출 시간 배열 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열을 오름차순으로 정렬 
		Arrays.sort(P);
		
		int temp = 0;	// 각 사람들이 대기한 시간   
		int sum = 0;	// 인출시간 총합  
		
		for(int i = 0; i < N; i++) {
			temp += P[i];	// 대기 시간 + 인출 시간 
			sum += temp;	// 누적합
		}
		
		System.out.println(sum);
	}
}
