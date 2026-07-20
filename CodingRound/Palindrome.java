package CodingRound;

import java.util.Scanner;   
public class Palindrome {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine();
        int l = s.length() - 1;
        char sub;
		s = s.toLowerCase();
		String revS = new String();
		for(int i=l ; i >= 0 ; i-- ){
			sub = s.charAt(i);
			revS = revS + sub;
			}
		if( revS.equals(s) ){
			System.out.println("String Is Palindrome.");
		}else{ System.out.println("String Is not Palindrome."); }
        sc.close();
    }
}
