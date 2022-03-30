package Assignment_1;

import java.util.Scanner;

public class Question_19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = sc.nextInt();

        String binary = "";

        while(n > 0){
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }

        System.out.println("The number in binary can be expressed as " + binary);
    }

}
