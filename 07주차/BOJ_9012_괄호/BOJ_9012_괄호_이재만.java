import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer answer = new StringBuffer();
        for (int tc = 0; tc < T; tc++) {
            char[] s = br.readLine().toCharArray();
            int i = 0;                                          // 남은 ( 개수
            for (char c : s) {                                  // 문자 하나씩 확인
                i = c == '(' ? i + 1 : i - 1;                       // 문자가 '(' 일 경우 +1, ')' 일 경우 -1
                if (i < 0) break;                                   // 음수가 되면 반복종료
            }
            answer.append(i == 0 ? "YES\n" : "NO\n");           // 짝이 모두 맞으면 YES 아니면 NO
        }
        System.out.println(answer);
    }
}
