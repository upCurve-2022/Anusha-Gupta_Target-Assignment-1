package Assignment_1;

import java.util.Scanner;

public class Question_22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        int n = sc.nextInt();

        int t1 = 0, t2 = 1;
        System.out.print(t1 + " " + t2 + " ");

        for(int i = 2; i <= n; i++){
            int temp = t1 + t2;
            t1 = t2;
            t2 = temp;
            System.out.print(t2 + " ");
        }

    }

}
