package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
1. 대소문자를 구분하지 않고 사전순 우선순위 높은거 선택.
 */
public class BOJ_2204_도비의난독증테스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list;
        while (true) {

            int tc = Integer.parseInt(br.readLine());
            list = new ArrayList<>();

            for (int i = 0; i < tc; i++) {
                String dobby = br.readLine();
                list.add(dobby);
            }

            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

            if (tc == 0) break;
            System.out.println(list.get(0));

        }
    }
}
