import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[7];													// 정수 배열에 7개의 수를 입력받음
		for (int i = 0; i < 7; i++) {
			nums[i] = sc.nextInt();
		}
		int[] oddNums = Arrays.stream(nums).filter(x -> x % 2 == 1).toArray();		// 홀수 값으로 새로운 배열 생성
		int sumNum = Arrays.stream(oddNums).sum();									// 홀수의 합
		OptionalInt minNum = Arrays.stream(oddNums).min();							// 홀수 중 최소값
		if (minNum.isPresent()) {													// 최소값이 존재하면
			System.out.println(sumNum);													// 합 출력
			System.out.println(minNum.getAsInt());										// 최소값 출력
		} else {																	// 최소값이 존재하지 않으면
			System.out.println(-1);														// -1 출력
		}
		sc.close();
	}
}
