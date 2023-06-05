package BOJ_2576_홀수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[7];
        ArrayList<Integer> al = new ArrayList<Integer>();
        int sum=0;
        boolean ckeck=false;
        
        for(int i=0; i<=6; i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==1){
                ckeck=true;
                sum+=arr[i];
                al.add(arr[i]);
            }
        }
        Collections.sort(al);
        
        if(ckeck==false){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(al.get(0));
        }
      sc.close();
      

    }
}