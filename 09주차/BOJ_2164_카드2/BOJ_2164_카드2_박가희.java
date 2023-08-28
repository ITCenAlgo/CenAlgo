package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164_카드2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		
		while(q.size() != 1)
		for(int i=0; i<q.size(); i++) {
			q.remove();
			int tmp = q.peek();
			q.remove();
			q.offer(tmp);
		}
		System.out.println(q.poll());
	}

}
