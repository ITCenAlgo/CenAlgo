public class BOJ_3040_백설공주와일곱난쟁이_양혜교{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[9];         // 난쟁이 배열 생성
        int sum = 0;
        int n1 = 0, n2 = 0;             // 가짜 난쟁이 2명

        for(int i=0; i<arr.length; i++){         // 입력값들을 배열에 저장
            arr[i] = scan.nextInt();
            sum += arr[i];                       // 배열의 합
        }

        Arrays.sort(arr);       // 배열 오름차순 정렬

        for(int i = 0; i < arr.length; i++){        // 이중 배열을 통해 가짜 난쟁이 추출
            for(int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == sum-100){     // 배열의 전체 값에서 진짜 난쟁이들의 합을 뺀 뒤
                    n1 = i;                         // 가짜 난쟁이들의 합을 찾음
                    n2 = j;
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(i == n1 || i == n2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}