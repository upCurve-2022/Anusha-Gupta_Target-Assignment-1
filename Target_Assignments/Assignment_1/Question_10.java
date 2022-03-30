package Assignment_1;

import java.util.Scanner;

public class Question_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String ans = "";

        while(n > 0){
            int rem = n % 10;
            ans = arr[rem] + " " + ans ;
            n = n / 10;
        }

        System.out.println("The number in words can be expressed as " + ans) ;
    }
}
