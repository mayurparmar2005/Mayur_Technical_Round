package CodingRound;

import java.util.Scanner;

public class SecondLargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();     
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			System.out.print("Enter arr["+i+"] :");
			arr[i] = sc.nextInt();
		}
		int Largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		for(int j = 0 ; j < n ; j++){
			if(arr[j] > Largest){
                SecondLargest = Largest;
                Largest = arr[j];
            }
            else if(arr[j] > SecondLargest && arr[j] != Largest){
                SecondLargest = arr[j];
            }
		}
		if(SecondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest element.");
        }
        else{
            System.out.printf("The Largest number is %d and Second Largest Number is %d . ",Largest,SecondLargest);
        }
        sc.close();
    }

}
