import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1546_평균_이미지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //과목 개수
		int[] scoreArr = new int[N]; //시험 점수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double sum = 0; //입력받은 정수의 합
		double newAvg = 0; //조작된 평균
		
		int i = 0;
		while(st.hasMoreTokens())
			sum += scoreArr[i++] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(scoreArr);
		newAvg = (sum/scoreArr[N-1]*100) / (double)N;
		
		System.out.println(newAvg);		
	}
}