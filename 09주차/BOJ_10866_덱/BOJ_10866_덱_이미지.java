package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10866_덱_이미지 {
	
	public static StringBuilder sb = new StringBuilder();
	public static List<Integer> deque = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) 
			{
				case "push_front" : push_front(Integer.parseInt(st.nextToken())); break;
				case "push_back" : push_back(Integer.parseInt(st.nextToken())); break;
				case "pop_front" : pop_front(); break;
				case "pop_back" : pop_back(); break;
				case "size" : size(); break;
				case "empty" : empty(); break;
				case "front" : front(); break;
				case "back" : back(); break;
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void push_front(int X) {
		deque.add(0, X);
	}
	
	public static void push_back(int X) {
		deque.add(X);
	}
	
	public static void pop_front() {
		if(deque.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		sb.append(deque.get(0) + "\n");
		deque.remove(0);
	}
	
	public static void pop_back() {
		if(deque.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		int b_idx = deque.size()-1;
		sb.append(deque.get(b_idx) + "\n");
		deque.remove(b_idx);
	}
	
	public static void size() {
		sb.append(deque.size() + "\n");
	}
	
	public static void empty() {
		if(deque.isEmpty()) 
			sb.append(1 + "\n");
		else
			sb.append(0 + "\n");
	}
	
	public static void front() {
		if(deque.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		sb.append(deque.get(0) + "\n");
	}
	
	public static void back() {
		if(deque.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		int b_idx = deque.size()-1;
		sb.append(deque.get(b_idx) + "\n");
	}
}
