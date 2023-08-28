package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4383_점프는즐거워6 {

	public static void main(String[] args) throws IOException {
		// 16% 2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		int n = 0;
		
		boolean jolly = true;
		
		while((input = br.readLine()) != null) { //입력받은 값을 줄 단위로 읽어 들임 -> null 일때까지 계속 : EOF
			StringTokenizer st = new StringTokenizer(input);
			
			n = Integer.parseInt(st.nextToken());
			int[] sy = new int[n];
			for(int i=0; i<n; i++) {
				sy[i] = Integer.parseInt(st.nextToken());
			}
			
			int[] minus = new int[n-1]; //두수의 차를 담기 위한 배열
			
			if(n == 1) {
				jolly = true;
			} else {
				for(int i=0; i<n-1; i++) {
					minus[i] = Math.abs(sy[i] - sy[i+1]);
				} 
				for(int i=0; i<minus.length-1; i++) {
					if(Math.abs(minus[i]-minus[i+1]) == 1) {
						jolly = true;
					} else {
						jolly = false;
					}
				}
			}
			
			if(jolly==true) {
				System.out.print("Jolly");
			} else {
				System.out.print("Not Jolly");
			}
		}
	}
}
