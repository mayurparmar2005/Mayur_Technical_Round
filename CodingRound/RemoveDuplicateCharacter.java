package CodingRound;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to remove Duplicate Character:");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean dup = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
