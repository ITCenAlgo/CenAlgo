package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2508 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		char[][] matrix;
		int t = Integer.parseInt(br.readLine());// 테스트 케이스 개수
		int row, col; //행,열
		int cnt = 0;
		
		String s;
		for (int k = 0; k < t; k++)
		{
			br.readLine();

			//행,열 입력받기
			st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			
			//행렬 만들기
			matrix = new char[row][col];
			for (int i = 0; i < row; i++) {
				s = br.readLine();
				for (int j = 0; j < col; j++)
					matrix[i][j] = s.charAt(j);
			}
			
			//사탕 찾기
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if(matrix[i][j] == 'o') {
						if(j != 0 && j != (col-1) && matrix[i][j-1] == '>' && matrix[i][j+1] == '<') cnt++;
						if(i != 0 && i != (row-1) && matrix[i-1][j] == 'v' && matrix[i+1][j] == '^') cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			cnt = 0;
		}
	}

}
