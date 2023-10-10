package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630_색종이만들기 {

	public static int[][] arr;
	public static int white = 0;
	public static int blue = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		partition(0, 0, N);
		System.out.println(white + "\n" + blue);
	}
	
	public static void partition(int row, int col, int size) {
		if(check(row, col, size)) {
			if(arr[row][col] == 0) white++;
			else blue++;
			
			return;
		}
		
		int pSize = size / 2;
		partition(row, col, pSize);
		partition(row, col + pSize, pSize);
		partition(row + pSize, col, pSize);
		partition(row + pSize, col + pSize, pSize);
	}
	
	public static boolean check(int row, int col, int size) {
		int first = arr[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if(first != arr[i][j]) return false;
			}
		}
		return true;
	}
}
