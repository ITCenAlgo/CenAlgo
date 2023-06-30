package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_4383_점프는즐거워_이미지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean isJolly = true; //Jolly인지 아닌지 체크
		
		List<String> input = new ArrayList<String>();
		String s = null;
		while((s = br.readLine()) != null) { //EOF, 수열을 한 줄씩 받아온다.
			input.add(s);
			
			st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken()); //수열의 길이
			
			//공차를 구하기 위한 연속한 두 항
			int prev = Integer.parseInt(st.nextToken()); //앞 항
			int next; //뒤 항
			
			int[] dArr = new int[N-1]; //수열의 공차를 저장하는 배열
			for (int i = 0; i < dArr.length; i++) {
				next = Integer.parseInt(st.nextToken());
				dArr[i] = (prev-next > 0) ? prev-next : next-prev; //공차
				prev = next; //다음 원소와 비교하기 위해 첫번째 원소
			}
			
			Arrays.sort(dArr); //공차 정렬
			
			for (int i = 0; i < dArr.length; i++) { //공차가 [1 ~ n-1]까지 순서대로인지 체크
				if(dArr[i] != i+1) {
					isJolly = false;
					break;
				}
			}
			
			if(isJolly)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
            
            isJolly = true; //flag 초기화
		}
	}
}
