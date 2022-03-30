package Assignment_1;

import java.util.Scanner;

public class Question_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers to be swapped");
        int count = sc.nextInt();
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        if(count == 3){
            System.out.println("Enter the third number:");
            int c = sc.nextInt();
            swap(a, b, c);

        }

        else{
            swap(a, b);

        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the value of a is " + a +" and the value of b is " + b );
    }

    public static void swap(int a, int b, int c){
        int temp = a;
        a = b;
        b = temp;

        temp = b;
        b = c;
        c = temp;

        System.out.println("After swapping the value of a is " + a +" the value of b is " + b + " and the" +
                " value of c is " + c);
    }
}
