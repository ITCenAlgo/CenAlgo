package Week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2576_홀수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 7;			// 입력받는 자연수 개수 
		int min = 100;		// 최솟값 (100 이하의 자연수이므로)
		int num, sum = 0;
		
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			
			// 홀수일 경우 
			if(num % 2 == 1) {
				sum += num;
				
				if(num < min) min = num;
			}
		}
		
		br.close();
		
		// 출력 
		if(min == 100 && sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);
		}
	}
}
