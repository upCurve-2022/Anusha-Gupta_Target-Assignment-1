package Assignment_1;

import java.util.Scanner;

public class Question_16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        int n1 = 1, mF = 1, aF = 4;

        for(int i =1; i <= n; i++){
            System.out.print(n1 + " ");
            n1 = n1 + aF;
            if(i % 2 != 0){
                mF += 1;
            }
            else{
                mF += 2;
            }
            aF = 4 * mF;
        }
    }
}
