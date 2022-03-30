package Assignment_1;

import java.util.Scanner;

public class Question_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers to be compared");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a > (b > c ? b : c) ? a : (b > c ? b : c);
        int secMax = 0;
        if(max == a){
            secMax = b > c ? b : c;
        }
        else if(max == b){
            secMax = a > c ? a : c;
        }
        else{
            secMax = a > b ? a : b;
        }

        System.out.println("The largest number is " + max);
        System.out.println("The second largest is " + secMax);
    }
}
