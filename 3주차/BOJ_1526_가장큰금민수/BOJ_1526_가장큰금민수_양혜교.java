public class BOJ_1526_가장큰금민수_양혜교 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=N; i>=4; i--){
            String num = String.valueOf(i);
            int result = 0;

            for(int j=0; j<num.length(); j++){
                if(num.charAt(j) == '4' || num.charAt(j) == '7'){
                    result++;
                }
            }

            if(result == num.length()){
                System.out.println(num);
                break;
            }
        }
    }
}