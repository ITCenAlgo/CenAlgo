import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer[] nums = new StringBuffer[N];
        for (int i = 0; i < N; i++) {
            nums[i] = new StringBuffer(br.readLine());
        }
        int M = nums[0].length();
        Loop1:
        for (int k = 1; k < M + 1; k++) {
            Set<String> chk = new HashSet<>();          // 잘라서 나온 숫자를 set에 저장
            for (int i = 0; i < N; i++) {
                String s = nums[i].substring(M - k);        // 뒤에서 k 자리를 자른 번호
                if (chk.contains(s)) continue Loop1;        // 이미 set 에 있다면 다음 k 확인
                chk.add(s);                                 // 아니라면 현재 번호를 set 에 추가
            }
            System.out.println(k);
            break;
        }
    }
}
