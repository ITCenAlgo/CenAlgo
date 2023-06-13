import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        int cycle = 0;
        int N = input;
        int newN = -1;
        int a, b;
        
        do{
            a = N/10; //a : 10의자리
            b = N%10; //b : 1의자리
            
            N = newN = (a+b<10) ? (b*10 + (a+b)) : (b*10 + (a+b)%10);
                
            cycle++;
        }while(input != newN);
        
        System.out.print(cycle);
    }
}
