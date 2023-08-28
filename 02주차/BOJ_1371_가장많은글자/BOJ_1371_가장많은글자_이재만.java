import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.lines().collect(Collectors.joining());        // 문자열 한번에 입력받기
        int[] cnt = new int[26];                                    // a ~ z 까지 나온 횟수를 저장할 배열
        for (char c : s.toCharArray()) {                            // 문자열의 문자를 하나씩 반복
            if (c == ' ')                                               // 공백은 무시
                continue;
            cnt[c - 'a'] += 1;                                          // 해당 문자의 인덱스값 +1
        }
        int maxCnt = Arrays.stream(cnt).max().getAsInt();           // 가장 많이 나온 횟수 저장
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < 26; i++) {                              // a ~ z 까지 반복
            if (cnt[i] == maxCnt)                                       // 가장 많이 나온 문자이면
                answer.append((char) (i + 'a'));                            // 정답에 추가
        }
        System.out.println(answer);
    }
}
