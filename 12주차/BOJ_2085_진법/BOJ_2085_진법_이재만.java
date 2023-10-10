import java.io.*;

class Main {
    static long cnt(String l, String r) {                           // l: 숫자 부분, r: 진법
        if (r.charAt(0) == '0') {                                   // 진법 부분이 0으로 시작하면
            return 0;                                               // 불필요한 0을 포함했으므로 세지 않고 0리턴
        }
        int n = l.length();                                         // l을 한자리씩 늘려가며 개수를 셈
        long[] dp = new long[n + 1];                                // dp에는 자리수 별 가능한 숫자의 개수를 저장
        dp[0] = 1;                                                  // ex) l = 1234, r = 56 이고, l 중 123 까지 탐색 완료한 경우
        for (int i = 1; i < n + 1; i++) {                           //     [123] 4, [12] 34, [1] 234, 1234 ([] 안에는 해당 수로 만든 경우의 수가 들어감) 가 새로운 수의 모든 경우이며
            String target = l.substring(0, i);                      //     이 때 [1] 234, 1234 는 진법의 수(r = 56)보다 크므로 제외
            for (int j = target.length(); j > 0; j--) {             //     따라서 123의 경우의 수(dp[3])와 12의 경우의 수(dp[2])를 더해준 값이 dp[4]가 됨
                String cur = target.substring(target.length() - j);
                if (cur.length() > r.length() || (cur.length() == r.length() && cur.compareTo(r) >= 0) || (cur.length() > 1 && cur.charAt(0) == '0')) continue;
                dp[i] += dp[target.length() - j];
            }
        }
        return dp[n];                                               // 최종적으로 l로 만들 수 있는 숫자 개수인 dp[n]을 리턴
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        if (s.charAt(0) == '0') {                                   // 맨 앞 숫자가 0일 경우
            if (s.length() > 1 && s.charAt(1) > '0') {              // 불필요한 0을 사용하지 않고 숫자를 만드려면 0 하나밖에 없음
                System.out.println(1);                              // 따라서 진법에 사용되는 숫자가 0보다 크거나 0으로 시작하지 않으면 1을 출력하고
            } else {                                                // 아니라면 0을 출력
                System.out.println(0);
            }
            return;
        }
        long answer = 0;
        for (int i = 1; i < n; i++) {                               // 입력받은 숫자를 숫자 부분과 진법 부분으로 나눔
            String l = s.substring(0, i);                           // 두 숫자의 길이는 1이상이 되도록 나눔
            String r = s.substring(i, n);                           // 가능한 숫자를 모두 세서 answer에 개수를 더해줌
            answer += cnt(l, r);
        }
        System.out.println(answer);
    }
}
