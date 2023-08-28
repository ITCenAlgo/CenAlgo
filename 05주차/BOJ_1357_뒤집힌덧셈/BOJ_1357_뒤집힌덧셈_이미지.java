package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1357_뒤집힌덧셈_이미지 {
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String X = st.nextToken();
		String Y = st.nextToken();
		
		System.out.println(Rev(String.valueOf(Rev(X) + Rev(Y))));
	}
	
	static int Rev(String num) {
		sb = new StringBuilder(); 
		sb.append(num).reverse(); //역순

		return Integer.parseInt(sb.toString()); //int형으로 return
	}
}
