package week03;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2204_도비의난독증테스트4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] sen;
		
		while(true) {
			int T = sc.nextInt();	
			if(T == 0) { //0 입력 전까지 반복
				break;
			}
			
			sen = new String[T]; 
			for(int i=0; i<T; i++) { //입력한 단어로 배열 만들기
				sen[i] = sc.next();
			}
				Arrays.sort(sen, String.CASE_INSENSITIVE_ORDER);
				//대소문자 구분없이 문자열 오름차순 정렬
				System.out.println(sen[0]); //가장 첫번째 단어 출력
		}
	}
}
