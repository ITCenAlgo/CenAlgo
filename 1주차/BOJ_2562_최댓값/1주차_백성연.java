import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[9];

        for(int i=0; i<=8; i++){
            int con=sc.nextInt();
            num[i]=con;
        }
        
        int[] num2 = num.clone();
        Arrays.sort(num);
        System.out.println(num[8]);
        for(int z=0;z<=8;z++){
            if(num2[z]==num[8]){
                System.out.println(z+1);        
                break;
            }
        }
        sc.close();

    }
}