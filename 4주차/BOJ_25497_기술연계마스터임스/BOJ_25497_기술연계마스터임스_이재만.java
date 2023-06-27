import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] skill = br.readLine().toCharArray();
        int[] LS = {0, 0};                      // 사전기술 누적 횟수
        int answer = 0;
        for (char s : skill) {
            if ('1' <= s && s <= '9')               // 숫자이면
                answer += 1;                            // answer +1
            else if (s == 'L' || s == 'S')          // 사전기술이면
                LS[s % 2] += 1;                         // 각각의 기술 횟수 +1
            else if (LS[s % 2] == 0)                // 사전기술 없이 본 기술을 사용하는 경우
                break;                                  // 종료
            else {                                  // 본 기술 사용하는 경우
                LS[s % 2] -= 1;                         // 사전 기술 횟수 -1
                answer += 1;                            // answer +1
            }
        }
        System.out.println(answer);
    }
}
