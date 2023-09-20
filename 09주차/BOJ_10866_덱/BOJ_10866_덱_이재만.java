import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] Q = new String[20000];
        int f = 9999, r = 9999;                                             // f : deque의 맨 앞 인덱스
        StringBuffer answer = new StringBuffer();                           // r : deque의 맨 뒤 인덱스
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String c = st.nextToken();
            if (c.equals("push_front")) {                                       // front의 경우 f 위치에 넣어주고 f를 1감소
                String v = st.nextToken();
                Q[f--] = v;
            } else if (c.equals("push_back")) {                                 // rear의 경우 r을 1증가시키고 그 위치에 넣어줌
                String v = st.nextToken();
                Q[++r] = v;
            } else if (c.equals("pop_front")) {                                 // 요소를 빼줄때는 반대로 front의 경우 f를 1증가시킨 후 해당 요소 출력, 비었다면 -1
                answer.append(f == r ? "-1" : Q[++f]).append("\n");
            } else if (c.equals("pop_back")) {                                  // rear의 경우 요소 출력 후 r을 1감소, 비었다면 -1
                answer.append(f == r ? "-1" : Q[r--]).append("\n");
            } else if (c.equals("size")) {                                      // rear - front 인덱스 값이 size
                answer.append(r - f).append("\n");
            } else if (c.equals("empty")) {                                     // 두 인덱스값이 같다면 요소가 없음
                answer.append(f == r ? "1\n" : "0\n");
            } else if (c.equals("front")) {                                     // pop이 아닌 출력의 경우 pop과 같은 요소를 출력하고 인덱스는 그대로 둠
                answer.append(f == r ? "-1" : Q[f + 1]).append("\n");
            } else if (c.equals("back")) {
                answer.append(f == r ? "-1" : Q[r]).append("\n");
            }
        }
        System.out.println(answer);
    }
}
