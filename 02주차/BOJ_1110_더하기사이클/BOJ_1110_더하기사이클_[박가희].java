package week02;

import java.util.Scanner;

public class BOJ_1110_더하기사이클 {
/* 첫쨰줄에 n이 주어지고 n의 사이클을 출력함
 * 10보다 작으면 0을 붙여 두자리 수로 만들고, 각자리의 숫자를 더한다 -> 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리수를 이어붙여 새로운 수를 만듬
 * 26 -> 2+6 = 8 -> 68 -> 6+8 = 14 -> 84 -> 8+4 = 12 -> 42 -> 4+2 = 6 -> 26
 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
	
		int tmp = (N/10)*10 + (N%10); //tmp == N
		int nextN = ((tmp%10)*10)+((tmp/10)+(tmp%10))%10;
	
		int cnt = 1;
		
		while(N != nextN) {
			tmp = nextN;
			nextN = ((tmp%10)*10)+((tmp/10)+(tmp%10))%10;
			cnt++;
			}
		System.out.println(cnt);
	}
}
