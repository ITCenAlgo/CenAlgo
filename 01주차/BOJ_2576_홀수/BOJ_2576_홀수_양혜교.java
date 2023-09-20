package BOJ_2576_홀수;

import java.util.Scanner;

public class BOJ_2576_홀수_양혜교 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[7];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int sum = 0;
        int min = 1000;
        boolean all = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                all = true;
                sum += arr[i];

                if(arr[i]<min){
                    min = arr[i];
                }
            }
        }

        if(!all){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }


    }
}
