package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12789_도키도키간식드리미_이미지 {
	public static Stack<Integer> stack = new Stack<>(); 
	public static int order = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		while(true) {
			if(st.hasMoreTokens()) {
				stack.push(Integer.parseInt(st.nextToken()));
				
				int size = stack.size();
				for (int i = 0; i < size; i++) {
					if(stack.isEmpty())
						break;
					
					if(stack.peek() == order) {
						stack.pop();
						order++;
					}
					else
						break;
				}
			}
			else
				break;
		}

		if(stack.isEmpty())
			System.out.println("Nice");
		else
			System.out.println("Sad");
	}
}
