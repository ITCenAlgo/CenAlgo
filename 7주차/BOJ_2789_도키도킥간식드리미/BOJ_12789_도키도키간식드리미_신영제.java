package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;

/*
1. 학생들을 배열에 우선 담는다.
2. 학생과 eat이 같다면 pass
3. 반복을 다 끝내고 eat을 비교해가며 pop 실행
4. 스택에 값이 있다면 Sad 없다면 Nice
 */
public class BOJ_12789_도키도키간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int eat = 1;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

                int student = arr[i];

                if (student == eat) eat++;
                else stack.push(student);

                while (!stack.isEmpty() && stack.peek() == eat) {
                    stack.pop();
                    eat++;
                }

        }

        if (stack.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}