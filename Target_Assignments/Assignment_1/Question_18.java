package Assignment_1;

import java.util.Scanner;

public class Question_18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        long factorial = fact(n);
        System.out.println("Factorial of "+ n + " is " + factorial);
    }

    public static long fact(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
