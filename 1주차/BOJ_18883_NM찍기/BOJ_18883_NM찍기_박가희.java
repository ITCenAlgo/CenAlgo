package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18883_NM찍기 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int cnt = 1;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(cnt).append(" ");
				cnt++;
				if (j == m - 1) {
					sb.deleteCharAt(sb.lastIndexOf(" "));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
