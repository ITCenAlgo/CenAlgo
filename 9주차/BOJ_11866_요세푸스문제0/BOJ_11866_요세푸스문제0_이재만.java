import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> arr = new ArrayDeque<>();
        for (int i = 1; i <= N; i++)                            // 순서대로 deque에 넣어줌
            arr.add(i);
        StringBuffer answer = new StringBuffer("<");
        while (!arr.isEmpty()) {                                // 모든 사람이 제거될 때까지 반복
            for (int i = 0; i < K - 1; i++)                         // K - 1명의 사람은 다시 맨 뒤에 붙임
                arr.add(arr.poll());
            answer.append(arr.poll()).append(", ");                 // K번째 사람은 제거하여 answer에 순차적으로 넣어줌
        }
        answer.delete(answer.length() - 2, answer.length());    // 마지막 구분자 제거
        answer.append('>');
        System.out.println(answer);
    }
}
