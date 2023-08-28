import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> num = new HashSet<>();                         // 아홉 난쟁이의 숫자를 저장할 set
        int sum = 0;                                                    // 숫자의 총 합
        for (int i = 0; i < 9; i++) {                                   // 9개의 입력을 받아서 합과 set에 추가
            int n = Integer.parseInt(br.readLine());
            num.add(n);
            sum += n;
        }
        for (int n : num) {                                             // 각각의 숫자를 하나씩 반복
            int check = sum - n;                                            // 총 합에서 현재 숫자 n 을 뺀 값을 check 에 저장
            if (n != check - 100 && num.contains(check - 100)) {            // check 에서 100 을 뺀 값이 set 에 있고 현재 값 n 을 두번 뺀 것이 아니면
                num.remove(n);                                                  // 해당 숫자 2 개가 빠지면 합이 100 이 되므로
                num.remove(check - 100);                                        // 2 개의 숫자를 set 에서 제거 후 반복 종료
                break;
            }
        }
        for (int n : num) {
            System.out.println(n);
        }
    }
}
