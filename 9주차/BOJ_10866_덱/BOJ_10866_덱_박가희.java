package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_10866_덱 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine()); //명령 수 입력
		
		Deque<Integer> d = new ArrayDeque<>();
		
		for(int i=0; i<N; i++) {
			String s[] = br.readLine().split(" "); //명령 입력
				
			switch (s[0]) {
			case "push_front":
				d.addFirst(Integer.parseInt(s[1]));
				break;
				
			case "push_back":
				d.offerLast(Integer.parseInt(s[1]));
				break;
				
			case "pop_front":
				sb.append(d.isEmpty() ? -1 : d.pollFirst()).append("\n");
				break;
				
			case "pop_back":
				sb.append(d.isEmpty() ? -1 : d.pollLast()).append("\n");
				break;
				
			case "size":
				sb.append(d.size()).append("\n");
				break;
				
			case "empty":
				sb.append(d.isEmpty() ? 1 : 0).append("\n");
				break;
				
			case "front":
				sb.append(d.isEmpty() ? -1 : d.peekFirst()).append("\n");
				break;
				
			case "back":
				sb.append(d.isEmpty() ? -1 : d.peekLast()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
