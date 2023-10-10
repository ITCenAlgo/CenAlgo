package BOJ_1697_숨바꼭질;

import java.io.*;
import java.util.*;

// 메모리 : 18684KB  시간 : 164ms
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // 처음부터 위치가 같을때 
        if (n == k) {
            System.out.println(0);
            return;
        }
        
        boolean[] visited = new boolean[100001];
        visited[n] = true;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        
        int size = q.size();
        int count = 0;
        
        while (true) {
            count++;
            size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.remove();
                visited[x] = true;

                // 종료 기준 
                if (x-1 == k || x+1 == k || x*2 == k) {
                    System.out.println(count);
                    return;
                }
                if (x-1 >= 0 && !visited[x-1]) {
                    visited[x-1] = true;
                    q.add(x-1);
                }
                if (x+1 <= 100000 && !visited[x+1]) {
                    visited[x+1] = true;
                    q.add(x+1);
                }
                if (x*2 <= 100000 && !visited[x*2]) {
                    visited[x*2] = true;
                    q.add(x*2);
                }
            }
        }
	}
}
