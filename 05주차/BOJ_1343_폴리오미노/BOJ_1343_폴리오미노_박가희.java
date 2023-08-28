package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1343_폴리오미노 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pol = br.readLine(); //한줄로 입력받기
		pol = pol.replace("XXXX","AAAA");
		pol = pol.replace("XX", "BB");
		
		if(pol.contains("X")) {
			System.out.println(-1); //X만 나왔을경우 -1 출력
		} else {
			System.out.println(pol);
		}
		
	}
}

