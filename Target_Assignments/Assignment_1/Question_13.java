package Assignment_1;

import java.util.Scanner;
import java.lang.Math;

public class Question_13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print((long)Math.pow(i ,i) + " ");
        }
    }
}
