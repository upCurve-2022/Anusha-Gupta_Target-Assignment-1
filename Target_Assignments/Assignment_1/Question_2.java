package Assignment_1;

import java.util.Scanner;

public class Question_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int sp = n-1, st = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < sp; j++){
                System.out.print("\t");
            }
            for(int j = 0; j < st; j++){
                System.out.print("\t*\t");
            }
            System.out.println();
            sp--;
            st++;
        }

    }
}
