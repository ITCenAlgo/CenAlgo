import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();        // 입력
        System.out.println((A[2] - A[1] - 1) / (A[0] - A[1]) + 1);                                      // V - A 를 올라가는 날을 계산 후 + 1
    }
}
