import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> gms = new ArrayList<>(Arrays.asList(4, 7));
        int i = 0;
        while (gms.get(i) * 10 < 1000000) {             // 100만 이하의 금민수를 오름차순 추가
            gms.add(gms.get(i) * 10 + 4);                   // 제일 작은 수부터 차례대로 탐색하여
            gms.add(gms.get(i++) * 10 + 7);                 // 각각 4와 7을 붙여 마지막 요소로 추가
        }
        for (i = gms.size() - 1; i >= 0; i--) {         // 큰 금민수부터 역순으로 탐색
            if (N >= gms.get(i)) {                          // N 이 더 커지면
                System.out.println(gms.get(i));                 // 출력 후 종료
                break;
            }
        }
    }
}
