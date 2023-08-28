package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
1. 숫자일 경우에는 CNT 증가
2. L일 경우의 Stack과 S일 경우의 Stack 을 생성
3. R과 K일 경우 해당 스택이 비어있는지 확인 후 비어있다면 반복문을 종료
 */
public class BOJ_25497_기술연계마스터임스 {

    static Stack<Character> setLR;
    static Stack<Character> setSK;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        char[] machine = br.readLine().toCharArray();
        cnt = 0;

        setLR = new Stack<>();
        setSK = new Stack<>();

        for (char chr : machine) {

            if (chr == 'L') setLR.push(chr);
            else if (chr == 'S') setSK.push(chr);
            else if (chr == 'R'){
                if(!findStack(setLR)) break;
            }
            else if (chr == 'K'){
                if(!findStack(setSK)) break;
            }
            else cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean findStack(Stack<Character> stack) {
       if(!stack.isEmpty()){
           cnt++;
           stack.pop();
           return true;
       }else return false;
    }

}