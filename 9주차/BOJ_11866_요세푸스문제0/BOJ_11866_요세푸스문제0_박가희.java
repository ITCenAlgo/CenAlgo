package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866_요세푸스문제0 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			que.offer(i); //큐 안에 1~N 까지 담기
		}

		sb.append("<");
		
		while(!que.isEmpty()) {
			for(int i=0; i<K-1; i++) { // K번째 수가 오기 전까지 poll로 빼서 다시 집어넣기
				int tmp = que.poll();
				que.offer(tmp);
			}
			sb.append(que.poll()).append(", "); // K번째 수가 맨 앞에 위치 -> poll로 빼준 후 다시 K번째 수가 오기 전까지 뒤로 넣기 반복
		}
		
		sb.delete(sb.length()-2, sb.length()).append(">"); // ", " 제거하고 ">" 붙이기
		System.out.println(sb);
		
	}
}
