package Array_rev;

import java.util.Scanner;

public class arr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The arrays are");
        for (int i =0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println("The sum of the array");
        for (int i =0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("the sum is " + sum);
    }
}
