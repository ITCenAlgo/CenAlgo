package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697_숨바꼭질 {

	public static int[] visited = new int[100001]; //배열의 index : 위치, value : 시간(초)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(bfs(N, K));
	}
	
	public static int bfs(int n, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Arrays.fill(visited, -1); //배열 초기값 설정
		
		queue.add(n); //수빈이의 처음 위치
		visited[n] = 0; //시간
		
		while(!queue.isEmpty()) {
			n = queue.remove();
			
			if(n == k) //수빈이와 동생의 위치가 같아지면 해당 위치의 시간 return
				return visited[n];
			if(n-1 >= 0 && visited[n-1] == -1) {
				visited[n-1] = visited[n] + 1;
				queue.add(n-1);
			}
			if(n+1 <= 100000 && visited[n+1] == -1) {
				visited[n+1] = visited[n] + 1;
				queue.add(n+1);
			}
			if(n*2 <= 100000 && visited[n*2] == -1) {
				visited[n*2] = visited[n] + 1;
				queue.add(n*2);
			}
		}
		
		return -1;
	}
}
