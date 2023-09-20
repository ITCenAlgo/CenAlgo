package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_25497_기술연계마스터임스2 {

	public static void main(String[] args) throws IOException {
		
		/* 사전 기술 -> 본 기술 : 본기술은 순서대로 사용해야 유효함 (중간에 하나라도 끼면 무효)
		 * 사전 기술 : L, S   /    본 기술 : R, K
		 * L -> R, S -> K 연계 필요 (사전기술, 본기술 순서대로 중복 사용 시 유효, 사전기술만 사용 시 유효)
		 * 1 ~ 9: 연계없이 사용 가능
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //스킬 개수
		
		String skill = br.readLine();
		char[] c = skill.toCharArray();
		int cnt = 0;
		int lr = 0;
		int sk = 0;
		
		OUT: for(int i=0; i<T; i++) { //OUT 사용 시 다중 반복문 모두 탈출
			if(c[i]>='1' && c[i]<='9') { //숫자만 카운트
				cnt++;
			} else {
				switch(c[i]) {
				case 'L': //L일 경우 +1
					lr++;
					break;
				case 'S': //S일 경우 +1
					sk++;
					break;
				case 'R': //R일 경우
					if(lr!=0) { //L이 먼저 나왔을때만 +1
						cnt++;
						lr--; //비우기
					} else {
						break OUT; //L 선행 X시 다중 반복문 종료
					}
					break;
				case 'K':
					if(sk!=0) { //S가 먼저 나왔을때만 +1
						cnt++;
						sk--; //비우기
					} else {
						break OUT; //S 선행 X시 다중 반복문 종료
					}
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
