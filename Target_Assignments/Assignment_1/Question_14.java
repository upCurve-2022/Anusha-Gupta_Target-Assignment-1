package Assignment_1;

import java.util.Scanner;

public class Question_14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        int n1 = 1, n2 = 4, n3 = 7;
        System.out.print(n1 + " " + n2 + " " + n3 + " ");

        for(int i = 0; i < n-3 ; i++){
            int temp = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = temp;

            System.out.print(temp + " ");
        }
    }
}
