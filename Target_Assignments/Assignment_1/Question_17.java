package Assignment_1;

import java.util.Scanner;

public class Question_17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + m + " are:");
        boolean flag = false;
        for(int i = n; i <= m; i++){
            flag = false;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag && i != 0 && i != 1){
                System.out.print(i + " ");
            }
        }
    }
}
