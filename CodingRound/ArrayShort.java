package CodingRound;

import java.util.Scanner;

public class ArrayShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();     
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			System.out.print("Enter arr["+i+"] :");
			arr[i] = sc.nextInt();
		}
        int l = arr.length - 1;
        int temp=arr[0];
        for(int i=0 ; i < l-1 ; i++){
            for(int j = i+1 ; j < l ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted ARRAY :");
        for(int i=0 ; i<=l ; i++){
            System.out.print(arr[i]+" ");
		}
        sc.close();
    }
}
