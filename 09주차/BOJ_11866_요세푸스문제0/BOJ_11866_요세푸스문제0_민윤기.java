package BOJ_11866_요세푸스문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 메모리 : 28300KB  시간 : 176ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		// 큐에 마지막 한 원소가 남을때까지 반복  
		while(queue.size() > 1) {
			// K번째 원소를 반환하기 위에 앞 원소들 처리 
			for(int i = 0; i < K-1; i++) {
				int pop = queue.poll();
				queue.add(pop);
			}
			sb.append(queue.poll()).append(", ");
		}
		// 마지막 원소 처리 
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}
}
