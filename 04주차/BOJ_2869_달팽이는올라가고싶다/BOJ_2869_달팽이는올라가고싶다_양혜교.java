public class BOJ_2869_달팽이는올라가고싶다_양혜교 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int day = (V-B) / (A-B);

        if((V-B) % (A-B) !=0){
            day++;
        }
        System.out.println(day);
    }
}