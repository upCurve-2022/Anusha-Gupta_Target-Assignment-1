import java.util.Scanner;
import java.lang.Math.*;

public class challenge_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double n = sc.nextDouble();

        double sqrt = Math.sqrt(n);
        double newSq = sqrt * sqrt;

        if(newSq == n){
            System.out.println(n + " is a perfect square");
        }
        else{
            System.out.println(n + " is not a perfect square");
        }
    }
}