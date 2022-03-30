import java.util.Scanner;

public class challenge_18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers to be compared :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a > (b > c ? b : c) ? a : (b > c ? b : c);
        System.out.println("The maximum out of the three numbers is : " + max);
    }
}