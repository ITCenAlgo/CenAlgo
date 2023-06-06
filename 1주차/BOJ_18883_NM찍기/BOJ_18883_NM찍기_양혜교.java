package BOJ_18883_NM찍기;

import java.util.Scanner;

public class BOJ_18883_NM찍기_양혜교 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N*M];
        int a = 0;

        for(int i=0; i<N*M; i++){
            a+=1;
            arr[i] = a;
        }

        for(int i=0; i<N*M; i++){
            System.out.print(arr[i] + " ");
            if(arr[i]%M == 0){
                System.out.println();
            }
        }
    }
}
