package BOJ_18883_NM찍기;

import java.io.*;
import java.util.Scanner;

public class BOJ_18883_NM찍기_양혜교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= N * M; i++) {
            bw.write(Integer.toString(i));
            if (i % M == 0) {
                bw.write("\n");
            }else{
                bw.write(" ");
            }
        }
        bw.close();

    }

}
