import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] order = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int i = 1;
        for (int o : order) {                                       // 줄 선 순서대로 확인
            if (o == i) i += 1;                                     // 맨 앞 사람이 간식을 받은 순서이면 받고 순서+1
            else stack.push(o);                                     // 아니라면 공간에 넣어줌
            while (!stack.isEmpty() && stack.peek() == i) {         // 공간의 사람들이 간식 받을 순서라면 받고 순서+1 반복
                i += 1;
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
