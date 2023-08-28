import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> card = new ArrayDeque<>();
        for (int i = 1; i < N + 1; i++)         // 번호를 순서대로 card 에 추가
            card.add(i);
        while (card.size() > 1) {               // 카드가 1장 남을 때까지 버리고 마지막에 추가 반복
            card.poll();
            card.add(card.poll());
        }
        System.out.println(card.peek());
    }
}
