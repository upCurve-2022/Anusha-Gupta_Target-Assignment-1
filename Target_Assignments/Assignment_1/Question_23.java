package Assignment_1;

import java.util.Scanner;

public class Question_23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        int n = sc.nextInt();

        int t1 = 1, t2 = -2;

        for(int i = 1; i <= n/2; i++){
            System.out.print(t1 + " " + t2 +" ");
            t1 += 3;
            t2 += -4;
        }

    }
}
