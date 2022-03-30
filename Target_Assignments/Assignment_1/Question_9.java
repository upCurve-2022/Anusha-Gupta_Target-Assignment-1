package Assignment_1;

import java.util.Scanner;

public class Question_9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String ans = "";
        System.out.println("The original number is "+ n);

        while(n > 0){
            int rem = n%10;
            ans = ans + rem;
            n = n / 10;
        }

        System.out.println("On reversing the number becomes " + ans);

    }
}
