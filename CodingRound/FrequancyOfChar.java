package CodingRound;
import java.util.Scanner;
public class FrequancyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine();
        int l = s.length();
        char sub;
        s = s.toLowerCase();
        int count;
        for(int i=0 ; i < l ; i++ ){
            sub = s.charAt(i);
            count = 1;
            for(int j=i+1; j<l; j++){
                if(sub == s.charAt(j)){
                    count++;
                }
            }
            System.out.println("Frequency of "+sub+" is "+count);
        }
        sc.close();
    }
}
