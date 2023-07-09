public class BOJ_1812_사탕_양혜교 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int[] answer = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i%2!=0){
                sum -= arr[i];      //  홀수
            }else{
                sum += arr[i];      // 짝수
            }
        }
        answer[0] = sum / 2;
        for(int i = 1; i < n; i++){
            answer[i] = arr[i-1] - answer[i-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}