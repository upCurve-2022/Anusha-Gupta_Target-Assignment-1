package Assignment_1;

import java.util.Scanner;

public class Question_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        int n1 = -1, n2 = 2;

        for(int i = 1; i <= n/2; i++){
            System.out.print(n1 + " " + n2 + " ");
            n1 -= 2;
            n2 += 2;
        }
    }
}
