package Array_rev;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the array");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The arrays are ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        System.out.println("The reversed array ");
        for (int i = a.length -1; i>=0; i--){
            System.out.println(a[i] + " ");
        }


    }
}
