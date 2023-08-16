public class BOJ_11047_동전0_양혜교 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N =scan.nextInt();       // 동전의 종류

        int K = scan.nextInt();      // 만들어야 하는 가치의 합

        int a[] = new int[N];       // 동전들의 가치

        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
        }

        int cnt = 0;

        for(int i=N-1;i>=0;i--) {
            if(a[i]<=K) {
                cnt += K/a[i];
                K %= a[i];
            }
        }

        System.out.println(cnt);
    }

}