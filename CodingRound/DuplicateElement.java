package CodingRound;
import java.util.Scanner;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int l = 0 ; l < n ; l++){
			System.out.print("Enter arr["+l+"] :");
			arr[l] = sc.nextInt();
		}
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        sc.close();
    }
}
