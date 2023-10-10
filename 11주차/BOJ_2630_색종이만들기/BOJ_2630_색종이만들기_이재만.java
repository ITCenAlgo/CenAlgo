import java.io.*;
import java.util.*;

class Main {
    static int[][] arr;
    static int[] answer = {0, 0};

    static boolean check(int r1, int r2, int c1, int c2, int ref) {     // 모두 같은 색인지 판별하는 메소드
        for (int r = r1; r < r2; r++) {
            for (int c = c1; c < c2; c++) {
                if (arr[r][c] != ref) return false;
            }
        }
        return true;
    }

    static void DC(int r1, int r2, int c1, int c2) {
        if (check(r1, r2, c1, c2, arr[r1][c1])) {                       // 모두 같은 색이면 해당색 +1
            answer[arr[r1][c1]] += 1;
            return;
        }
        DC(r1, (r1 + r2) / 2, c1, (c1 + c2) / 2);                       // I 영역
        DC((r1 + r2) / 2, r2, c1, (c1 + c2) / 2);                       // II 영역
        DC(r1, (r1 + r2) / 2, (c1 + c2) / 2, c2);                       // III 영역
        DC((r1 + r2) / 2, r2, (c1 + c2) / 2, c2);                       // IV 영역
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = br.lines().map(x -> Arrays.stream(x.split(" ")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
        DC(0, N, 0, N);
        System.out.println(answer[0] + "\n" + answer[1]);
    }
}
