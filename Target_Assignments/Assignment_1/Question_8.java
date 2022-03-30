package Assignment_1;

import java.util.Scanner;

public class Question_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sume = 0, sumo = 0;
        for(int i = 2; i <= n; i += 2){
            sume += i;
        }
        for(int i = 1; i < n; i += 2){
            sumo += i;
        }

        System.out.println("The sum of even numbers upto " + n + " is " + sume);
        System.out.println("The sum of odd numbers upto " + n + " is " + sumo);
    }
}
