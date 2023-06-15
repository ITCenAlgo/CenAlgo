package week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BOJ_3040_백설공주와일곱난쟁이3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> dwf = new ArrayList<Integer>();
		int sum = 0; 
		
		for(int i=0; i<9; i++) {
			dwf.add(Integer.parseInt(br.readLine()));
			sum += dwf.get(i); //배열 내의 수 총합
		}
		
		// 아홉 난쟁이 중 가짜 난쟁이 두명을 뽑음
		// 전체 모자의 합 - 가짜 난쟁이 모자의 합 = 100 이 되어야한다
		for(int i=0; i<dwf.size(); i++) {
			for(int j=i+1; j<dwf.size(); j++) {
				if(sum - (dwf.get(i)+dwf.get(j)) == 100) {
					dwf.remove(i);
					dwf.remove(j-1); //remove(i)로 배열의 수가 줄어들었기 때문에 -1해줌
					break;
				}
			}
		}
		
		for(Integer i : dwf) {
			bw.write(i+"\n"); //출력
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
