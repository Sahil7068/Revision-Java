package ExceptionHand;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();

        boolean b = false;

        for(int i =2; i<n; i++){
            if (n%i == 0){
                b = true;
            }
        }

        if (b){
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");
        }
    }
}
