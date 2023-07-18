package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1812_사탕_이미지 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //학생 수

		int[] sumOfTwo = new int[N]; //인접한 두 학생이 가지고 있는 사탕 수의 합
		
		//사탕 수 입력, 모든 학생의 사탕 수의 합 계산
		int total = 0;//a1+a2+a3+...an (a1 : 첫번째 학생이 가진 사탕 수)
		for (int i = 0; i < N; i++) {
			sumOfTwo[i] = Integer.parseInt(br.readLine());
			total += sumOfTwo[i]; //2(a1+a2+a3+...an)
		}
		total /= 2; //a1+a2+a3+...an
		
		//사탕 수 계산 : a[i] = total - (sumOfTwo[i] + sumOfTwo[i+2] + ... + sumOfTwo[i+j])
		for (int i = 1; i <= N; i++) { //학생 수만큼 반복 
			int candy = 0; 
			for (int j = 0; j+2 < N; j+=2) //2씩 증가
				candy += sumOfTwo[i+j >= N ? i+j-N : i+j]; //sumOfTwo[i] + sumOfTwo[i+2] + ... + sumOfTwo[i+j]

			sb.append(total - candy); //a[i]
			
			if(i != N) //맨 마지막에는 줄바꿈 없음
				sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
