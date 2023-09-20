package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_1546_평균 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //과목 개수 입력
		Integer[] arr = new Integer[N]; //과목 개수만큼 배열 생성 (Collections 메소드 사용을 위해 Integer로 생성)
		
		//각 과목 점수 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		while(st.hasMoreTokens()) {
			arr[cnt++] = Integer.parseInt(st.nextToken());
		}
		
		//각 과목의 점수 중 최대값
		Arrays.sort(arr, Collections.reverseOrder()); //역순으로 정렬 (내림차순)
		double max = arr[0];

		//새로운 평균 구하기
		double tot = 0;
		double avg = 0;
		
		for(int i=0; i<N; i++) {
			tot += (arr[i]/(double)max) * 100 ;
			avg = tot/N;
		}
		System.out.println(avg);
	}
}
