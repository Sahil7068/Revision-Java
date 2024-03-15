package Array_rev;

import java.util.Scanner;

public class occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[]= new int[n];

        System.out.println("Enter the number to check for occurence");
        int x= sc.nextInt();

        System.out.println("Enter the array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The arrays are");
            for (int i = 0; i<n; i++){
                System.out.println(a[i]);
            }

            for (int i=0; i<n; i++){
                if (a[i] == x){
                    count ++;
                }
            }

        System.out.println("The occurence of " + x + " is " + count);
        }

    }

