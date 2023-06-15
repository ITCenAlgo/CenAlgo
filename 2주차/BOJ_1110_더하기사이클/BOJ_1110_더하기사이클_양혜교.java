
public class BOJ_1110_더하기사이클_양혜교{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();     // 0~99 입력
        int num = N;                // 새로운 수

        int cnt = 0;    //사이클 길이

        while(true){
            int left = num/10;            //10의 자리
            int right = num%10;           //1의 자리
            num = right*10 +(left+right)%10;
            cnt++;
            if(N == num){
                break;
            }
        }
        System.out.println(cnt);

    }
}