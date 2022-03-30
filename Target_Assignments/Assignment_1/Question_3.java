package Assignment_1;

import java.util.Scanner;

public class Question_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter the duration:");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;
        System.out.println("The Simple Interest is "+si);

    }
}
