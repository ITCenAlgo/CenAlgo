package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164_카드2_이미지 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> card = new LinkedList<>();
		
		for (int i = 1; i <= N; i++)
			card.add(i);
		
		while(card.size() > 1) {
			card.poll(); //제일 위에 있는 카드 버림
			card.add(card.poll()); //제일 아래에 있는 카드 맨 뒤로 이동
		}
		
		System.out.println(card.peek());
	}
}
