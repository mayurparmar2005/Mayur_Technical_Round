package CodingRound;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int d1 = 0, d2 = 1, d;
        for(int i =0 ; i< n; i++){
            d = d1 + d2 ;
            System.out.println(d);
            d1 = d2; 
            d2 = d;
        }
        sc.close();
    }
    
}
