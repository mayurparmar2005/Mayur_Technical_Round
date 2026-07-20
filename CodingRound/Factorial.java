package CodingRound;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n==1){
                return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Find Factorial:");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("Factorial of given n is :"+factorial);
        sc.close();
    }
    
}
