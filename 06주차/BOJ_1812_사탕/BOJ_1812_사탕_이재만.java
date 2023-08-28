import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] candy = new int[N];
        int total = 0, odd = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];                                // 입력 전체 합, 2로 나누면 전체 사탕 개수
            if (i % 2 == 0) odd += arr[i];                  // 홀수번째 입력 합, 전체 사탕 개수 + 1번 사탕 개수
        }
        candy[0] = odd - total / 2;                     // 1번 사탕 개수
        StringBuffer answer = new StringBuffer();
        answer.append(candy[0]).append("\n");
        for (int i = 1; i < N; i++) {
            candy[i] = arr[i - 1] - candy[i - 1];           // 나머지 사탕도 순차적으로 계산
            answer.append(candy[i]).append("\n");
        }
        System.out.println(answer);
    }
}
