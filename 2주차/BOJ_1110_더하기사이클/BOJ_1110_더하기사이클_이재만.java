import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());                        // 입력
        int x = N;                                                      // 새로운 수를 저장할 변수
        int answer = 1;                                                 // 사이클 길이
        while ((x = x % 10 * 10 + (x / 10 + x % 10) % 10) != N) {       // 연산한 값이 N과 같아질 때까지 반복
            answer += 1;                                                    // 사이클 길이 +1
        }
        System.out.println(answer);
    }
}
