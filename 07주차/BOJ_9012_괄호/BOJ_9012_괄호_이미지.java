package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_괄호_이미지 {
	public static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			stack.clear();
			
			if(VPS(br.readLine()))
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	public static boolean VPS(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
				stack.push(1);
			else { // ')'
				if(stack.size() == 0)
					return false;
				stack.pop();
			}
		}
		
		if(stack.size() == 0)
			return true;
		else
			return false;
	}
}
