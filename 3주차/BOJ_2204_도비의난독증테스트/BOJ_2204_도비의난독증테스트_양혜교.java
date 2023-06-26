public class BOJ_2204_도비의난독증테스트_양혜교 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            if(n == 0) {
                break;
            }

            String[] arr = new String[n];
            Map<String, String> arr2 = new HashMap<String, String>();

            for (int i = 0; i < n; i++) {
                String word = scan.next();
                arr[i] = word.toLowerCase();
                arr2.put(arr[i], word);
            }
            Arrays.sort(arr);
            System.out.println(arr2.get(arr[0]));
        }


    }
}