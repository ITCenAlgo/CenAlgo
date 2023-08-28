public class BOJ_1546_평균_양혜교 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        float[] arr = new float[N];     //배열 생성
        float max = 0;

        for(int i=0; i<N; i++){             // 배열 삽입
            arr[i] = scan.nextInt();        // 최대값 구하기
            if(arr[i]>max){
                max = arr[i];
            }
        }

        float ans = 0;

        for (int i = 0; i < N; i++) {       // 평균 구하기
            ans += (arr[i]/max*100)/N;
        }

        System.out.println(ans);

    }
}