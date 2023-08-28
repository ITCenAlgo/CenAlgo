package week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_1371_가장많은글자4 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		int max = 0;
		
		int[] apb = new int[26]; //알파벳 소문자 배열
		
		while((input = br.readLine()) != null) { //EOF
			for(int i=0; i<input.length(); i++) {
				char c = input.charAt(i); //입력된 값을 char로 변경
				if(c >= 'a' && c <= 'z') { //변경된 char값이 97보다 크고 122보다 작을경우(소문자)
					apb[c - 'a']++;	//배열에 해당하는 알파벳의 값에 +1 해서 가장 많이 나온 수 알아내기
				}
			}
		}
		
		for(int i=0; i<apb.length; i++) {
			if (max < apb[i]) { //알파벳 배열에서 가장 높은 수를 가진 값
				max = apb[i];
			}
		}
		
		for(int i=0; i<apb.length; i++) {
			if(max == apb[i]) { 
				bw.write((char)i+'a'); //max 알파벳 출력을 위해서 +97
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}	
}



