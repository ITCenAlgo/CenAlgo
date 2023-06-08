package Week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_18883_NM찍기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		br.close();
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		// M번째는 각 행의 마지막 -> 개행 
		for(int i = 1; i <= N * M; i++) {
			sb.append(i);
			if(i % M == 0)
				sb.append("\n");
			else
				sb.append(" ");
				
		}
		System.out.println(sb.toString());
	}
}
