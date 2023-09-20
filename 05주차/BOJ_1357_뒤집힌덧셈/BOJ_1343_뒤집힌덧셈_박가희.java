package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1343_뒤집힌덧셈3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = rev(Integer.parseInt(st.nextToken())) + rev(Integer.parseInt(st.nextToken()));
		System.out.println(rev(sum));
	}
	
	
	static int rev(int x) {
		StringBuffer sb = new StringBuffer();
		String reversed = sb.append(x).reverse().toString(); //StringBuffer에 담아서 reverse
		
		return Integer.parseInt(reversed); //계산해야하기 때문에 정수형으로 변환해서 리턴
	}
}

