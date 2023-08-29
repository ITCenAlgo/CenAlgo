package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
1. 걷는경우, 순간이동 할 경우 범위를 구함.
2. 각 경우에 해당하는 분기처리와 방문 처리
3. 수빈이가 1부터 시작 해서 -1 이후 출력
 */
public class BOJ_1697_숨바꼭질 {

    static int N;
    static int K;
    static int arr[];
    static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[100001];


        BFS();
        System.out.println(arr[K]-1);

    }

    private static void BFS() {
        queue = new LinkedList<>();
        queue.add(N);
        arr[N] = 1;

        while(!queue.isEmpty()){
            int now = queue.poll();

            if(now == K) return;

            int back = now-1;
            int front = now+1;
            int jump = now * 2;

            if(back >= 0 && arr[back]==0) work(back,now);
            if (front <= 100000 && arr[front]==0) work(front,now);
            if(jump <= 100000 && arr[jump] == 0) work(jump, now);
        }
    }

    private static void work(int num, int now) {
        arr[num] = arr[now]+1;
        queue.add(num);
    }
}
