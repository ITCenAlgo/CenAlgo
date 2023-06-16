import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        StringBuffer answer = new StringBuffer();
        while ((n = Integer.parseInt(br.readLine())) != 0) {                // 0 이 입력될 때까지 반복
            String pre = br.readLine();                                         // 빠른단어를 맨 처음 단어로 초기화
            for (int i = 1; i < n; i++) {                                       // n - 1 번 반복
                String word = br.readLine();                                        // 단어를 입력받음
                if (pre.compareToIgnoreCase(word) > 0)                              // pre 와 비교하여 빠른 단어를 pre 에 저장
                    pre = word;
            }
            answer.append(pre + "\n");
        }
        System.out.println(answer);
    }
}
