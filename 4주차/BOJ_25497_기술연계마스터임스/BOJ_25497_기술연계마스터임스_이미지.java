import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25497_기술연계마스터임스_이미지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[] skills = br.readLine().toCharArray();
		
		int result = 0, lCount = 0, sCount = 0;
		for (int i = 0; i < N; i++) {
			//1~9
			if(skills[i]-'0' >= 1 && skills[i]-'0' <= 9) result++;
			//사전기술 먼저 사용한 경우
			else if(skills[i] == 'L') lCount++;
			else if(skills[i] == 'S') sCount++;
			//연계 실패
			else if((skills[i] == 'R' && lCount == 0) || (skills[i] == 'K' && sCount == 0)) break;
			//연계 성공 
			else if((skills[i] == 'R' && lCount > 0) || (skills[i] == 'K' && sCount > 0)) 
			{
				if(skills[i] == 'R') lCount--;
				if(skills[i] == 'K') sCount--;
				
				result++;
			}
		}
		System.out.println(result);
	}
}
