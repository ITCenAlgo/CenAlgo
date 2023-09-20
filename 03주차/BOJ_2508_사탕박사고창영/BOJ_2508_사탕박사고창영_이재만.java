import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer answer = new StringBuffer();
        for (int tc = 0; tc < t; tc++) {
            br.readLine();
            int cnt = 0;                                                                                    // 사탕 개수
            StringTokenizer st = new StringTokenizer(br.readLine());                                        // 입력
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][];
            for (int i = 0; i < r; i++) {
                arr[i] = br.readLine().toCharArray();
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == '>' && j < c - 2 && arr[i][j + 1] == 'o' && arr[i][j + 2] == '<')      // 가로 방향 사탕 확인
                        cnt += 1;
                    if (arr[i][j] == 'v' && i < r - 2 && arr[i + 1][j] == 'o' && arr[i + 2][j] == '^')      // 세로 방향 사탕 확인
                        cnt += 1;
                }
            }
            answer.append(cnt + "\n");
        }
        System.out.println(answer);
    }
}
