package Assignment_1;

import java.util.Scanner;

public class Question_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        double decn = sc.nextDouble();
        String decStr = String.valueOf(decn);
        String arr[] = decStr.split("\\.");
        System.out.println(arr[0] + " " + arr[1]);

    }
}
