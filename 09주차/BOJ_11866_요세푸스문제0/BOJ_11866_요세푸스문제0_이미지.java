package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_11866_요세푸스문제0_이미지 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++)
			list.add(i);
		
		int idx = K-1; //index
		
		sb.append("<");
		for (int i = 1; i < N; i++) {
			sb.append(list.get(idx) + ", ");
			list.remove(idx);
			
			idx = (idx + K - 1) % list.size();
		}
		sb.append(list.get(0) + ">");
		
		System.out.println(sb.toString());
	}
}
