public class BOJ_11399_ATM_양혜교 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N =scan.nextInt();

        int a[] = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);

        int sum = a[0];

        for(int i = 1; i < N; i++){
            a[i] += a[i-1];
            sum += a[i];
        }
        System.out.println(sum);

    }

}