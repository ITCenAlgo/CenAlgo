package BOJ_10886_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

// 메모리 : 22412KB  시간 : 460ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// ArrayDeque 라이브러리 활용 
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			
				case "push_front": {
					deque.addFirst(Integer.parseInt(str[1]));
					break;
				}
					
				case "push_back": {
					deque.add(Integer.parseInt(str[1]));
					break;
				}
					
				case "pop_front": {
					if(deque.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(deque.poll());
					}
					break;
				}
				
				case "pop_back": {
					if(deque.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(deque.pollLast());
					}
					break;	
				}
					
				case "size": {
					System.out.println(deque.size());
					break;	
				}
				
				case "empty": {
					if(deque.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;	
				}
					
				case "front": {
					if(deque.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(deque.peek());
					}
					break;	
				}
				
				case "back": {
					if(deque.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(deque.peekLast());
					}
					break;	
				}
			}
		}
	}
}
