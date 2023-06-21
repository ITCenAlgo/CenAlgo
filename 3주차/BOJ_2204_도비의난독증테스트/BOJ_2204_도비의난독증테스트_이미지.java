package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> list = new ArrayList<String>(); //입력받은 단어 리스트
		List<String> resList = new ArrayList<String>(); //결과값 리스트
		
		int N; //단어의 개수
		String first; //가장 빠른 문자열
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			//단어 입력
			for (int i = 0; i < N; i++)
				list.add(br.readLine());
			
			//가장 빠른 단어 찾기
			first = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if(first.compareToIgnoreCase(list.get(j)) > 0)
						first = list.get(j);
				}
			}
			
			resList.add(first);
		}
		
		resList.forEach(s -> System.out.println(s));
	}

}
