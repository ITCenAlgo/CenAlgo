package BOJ_2164_카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 메모리 : 53476KB  시간 : 204ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		// queue에 마지막 하나 남을때까지 반복 
		while(queue.size() > 1) {
			queue.poll();
			int pop = queue.poll();
			queue.add(pop);
		}
		
		// 마지막 원소 처리 
		System.out.println(queue.poll());
	}
}
