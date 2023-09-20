public class BOJ_1343_폴리오미노_양혜교 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        String A="AAAA", B="BB";

        str = str.replaceAll("XXXX", A);
        result = str.replaceAll("XX", B);

        if(result.contains("X")){
            result = "-1";
        }

        System.out.println(result);


    }
}