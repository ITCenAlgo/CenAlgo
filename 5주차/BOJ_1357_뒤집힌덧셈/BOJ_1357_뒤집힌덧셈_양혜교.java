public class BOJ_1357_뒤집힌덧셈_양혜교 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();

        String num = "";
        while(X>0){
            num += X % 10;
            X /= 10;
        }
        int ReX = Integer.parseInt(num);

        String num2 = "";
        while(Y>0){
            num2 += Y % 10;
            Y /= 10;
        }
        int ReY = Integer.parseInt(num2);

        int sum = ReX + ReY;
        String result = "";
        while(sum>0){
            result += sum % 10;
            sum /= 10;
        }

        System.out.println(Integer.parseInt(result));

    }
}