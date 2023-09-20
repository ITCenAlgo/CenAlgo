import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());        // 입력 값을 뒤집어서 정수형으로 받음
        int Y = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        StringBuffer sb = new StringBuffer(Integer.toString(X + Y)).reverse();                  // X Y 를 더하고 뒤집음
        System.out.println(Integer.parseInt(sb.toString()));                                    // 불필요한 0 을 제거하고 출력
    }
}
