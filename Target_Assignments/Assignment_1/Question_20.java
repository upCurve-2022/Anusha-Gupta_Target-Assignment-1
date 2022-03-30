package Assignment_1;

import java.util.Scanner;

public class Question_20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary = sc.nextInt();

        int decimal = 0, i = 0;

        while (binary > 0) {
            int rem = binary % 10;
            int digit = (int) (rem * Math.pow(2, i));
            i++;
            decimal += digit;
            binary /= 10;
        }

        System.out.println("The binary number in decimal can be expressed as " + decimal);
    }

}
