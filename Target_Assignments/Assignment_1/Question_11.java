package Assignment_1;

import java.util.Scanner;

public class Question_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        for(int i = 2; i <= 2*n; i += 2){
            System.out.print(i*i + " ");
        }
    }
}
