import java.io.*;
import java.util.*;

class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int answer = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().map(x -> x * N--).sum();      // 오름차순 정렬 후 누적합의 합을 구해줌
        System.out.println(answer);
    }
}
