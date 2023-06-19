package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. 사탕알 탐색
2. 사탕알을 만나면 두가지의 경우 ( 위아래, 좌우 ) 껍질 충족시 cnt 증가.
 */
public class BOJ_2508_사탕박사고창영_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++){
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            char[][] arr = new char[r][c];

            // 공장초기화
            for(int i=0; i<r; i++){
                String candy = br.readLine();
                for(int j=0; j<c; j++){
                    arr[i][j] = candy.charAt(j);
                }
            }

            // 사탕 알 발견시 껍질 탐색
            int cnt = 0;
            for (int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(arr[i][j] == 'o'){
                        if(j-1 >= 0 && j+1 < c && arr[i][j-1] == '>' && arr[i][j+1] == '<') cnt ++;
                        if(i-1 >= 0 && i+1 < r && arr[i-1][j] == 'v' && arr[i+1][j] == '^') cnt ++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }


}
