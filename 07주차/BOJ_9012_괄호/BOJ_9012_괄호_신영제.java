package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
1. ( 라면 스택에 추가
2. ) 라면 + 스택 비어있다면 바로 NO
3. 그렇지 않다면 우선 POP
 */
public class BOJ_9012_괄호_신영제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int T = 0; T < tc; T++) {
            char[] VPS = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (char vp : VPS) {
                if (vp == '(') {
                    stack.push(vp);
                } else if (vp == ')') {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isVPS && stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
