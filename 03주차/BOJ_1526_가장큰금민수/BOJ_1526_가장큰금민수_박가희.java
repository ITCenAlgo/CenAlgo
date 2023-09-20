package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1526_가장큰금민수2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=N; i>=4; i--) { // 입력받은 수 ~ 4까지 -1로 반복
			int num = i; // N => num
			boolean gms = true;
			while(num!=0) {
				if(num%10==4 || num%10==7) {
					// num의 일의자리가 4 또는 7 이라면
					num = num/10;
					// num에 10을 나누어서 다음 자리 숫자를 찾음
				} else {
					// 4 또는 7이 아니라면 false -> break -> N-1 반복
					gms = false;
					break;
				}
			}
			
			if(gms == true) {
				System.out.println(i);
				break;
			}
		}
	}
}
