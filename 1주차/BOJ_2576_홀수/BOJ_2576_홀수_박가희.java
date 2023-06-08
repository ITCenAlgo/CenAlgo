package week01;

import java.util.Scanner;

public class BOJ_2576_홀수3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int sum = 0; 
		int min = 100;
		
		for(int i=0; i<7; i++) { //7개 자연수 입력으로 배열 생성
			arr[i] = sc.nextInt();
			if(arr[i]%2==1) { //홀수일 경우 합하기
				sum += arr[i];
				if(arr[i]<min) { //임시변수에 현재 값을 담아서 배열내의 적은값으로 비교 & 변경
					int tmp = arr[i];
					min = tmp;
				}
			}
		}
		
		if(sum == 0) { // 홀수가 없을 경우 총합이 0이 되므로 -1 출력
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
