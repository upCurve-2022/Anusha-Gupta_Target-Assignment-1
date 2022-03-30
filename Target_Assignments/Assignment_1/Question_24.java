package Assignment_1;

import java.util.Scanner;

public class Question_24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Enter the power :");
        int n = sc.nextInt();

        int ans = power(x ,n);
        System.out.println(x + " raised to the power " + n + " is " + ans);

    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return power(x, n/2) * power(x, n/2);
        }
        return x * power(x, n/2) * power(x, n/2);
    }
}
