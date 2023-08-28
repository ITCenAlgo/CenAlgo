package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1343_폴리오미노_이미지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ".", true); //"."으로 나눠서 token 생성("."도 토큰으로 포함)
		StringBuilder sb = new StringBuilder();

		int A, loc;
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			sb.append(token); //일단 저장

			if (token.equals(".")) //.인 경우 pass 
				continue;
			else if (token.length() % 2 != 0) { //.이 아니고, X가 홀수개인 경우 -1 출력
				System.out.println(-1);
				return;
			} 
			else {
				A = (token.length() / 4) * 4; //A로 채워야 하는 개수
				loc = sb.length() - token.length(); //sb 내에서 현재 토큰의 시작 위치 

				if(A != 0) //X가 4의 배수만큼 있는 경우
					sb.replace(loc, loc + A, sb.substring(loc, loc + A).replace('X', 'A')); //토큰의 시작위치부터 A만큼 A로 채운다.
				sb.replace(loc + A, sb.length(), sb.substring(loc + A).replace('X', 'B')); //나머지 B로 채운다.
			}
		}
		System.out.println(sb.toString());
	}
}
