package week06;

import java.io.*;
import java.util.HashSet;

public class BOJ_1235_학생번호 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hid = new HashSet<String>();
		
		int N = Integer.parseInt(br.readLine()); //학생 수
		String[] id = new String[N];
		
		for(int i=0; i<N; i++) { //학생 수 만큼 반복해서 아이디 입력
			id[i] = br.readLine();
		}
		
		for(int i=1; i<id[0].length(); i++) {
			for(int j=0; j<N; j++) {
				hid.add(id[j].substring(id[0].length() - i));
			}
			if(hid.size() == N) {
				System.out.println(i);
				return;
			}
			hid.clear();
		}
	}
}

