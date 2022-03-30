package Challenges;

import java.util.Scanner;
import java.lang.Math.*;

public class challenge_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = sc.nextDouble();
        double volume = (0.5)*(Math.PI*Math.pow(radius, 2))*height;
        System.out.println("The volume of the cylinder is : " + volume);
    }
}