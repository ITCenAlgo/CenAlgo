package week01;

import java.util.Scanner;

public class BOJ_2562_최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = -100;
		int cnt = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>max) {
				int tmp = arr[i]; //배열의 숫자를 tmp에 담아서 비교 후 더 큰 숫자를 max에 담음
				max = tmp;
				cnt = (i+1); //배열 순서는 0번째부터이기 때문에 +1
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}
}
