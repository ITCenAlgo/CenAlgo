package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_괄호4 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int T = Integer.parseInt(br.readLine()); //테스트케이스
		for(int i=0; i<T; i++) {
			Stack<Character> st = new Stack<>();
			String gr = br.readLine(); //괄호 값 입력
			
			boolean isVps = true;

			for(int j=0; j<gr.length(); j++) { //한줄의 괄호 개수 만큼 반복
				char c = gr.charAt(j); //입력된 괄호값 하나씩
				
				if(c == '(') { //'('일 경우 스택에 하나씩 넣기
					st.push(c);
				} 
				
				else {
					if(st.isEmpty()) { //스택이 비었을 경우 = '('가 없음 = VPS false
						isVps = false;
						break;
					}
					st.pop();
				}
			}
			
			if(!st.isEmpty()) {
				isVps = false;
			}
		
			if(isVps) {
				sb.append("YES\n");
			}
			else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}

}
