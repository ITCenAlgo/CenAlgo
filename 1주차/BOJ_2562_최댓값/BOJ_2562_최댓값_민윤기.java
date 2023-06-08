package Week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2562_최댓값 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 9;
		int max = 0;
		int num, count = 0;
		
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			
			// 최댓값 연산 
			if(num > max) {
				max = num;
				count = i;		// 순서 저장 
				
			}
		}
		
		System.out.println(max + "\n" + ( count + 1));
	}
}
