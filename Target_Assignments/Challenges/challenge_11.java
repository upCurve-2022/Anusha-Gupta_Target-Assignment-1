import java.util.Scanner;

public class challenge_11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputStr = sc.nextLine();
        System.out.println("The uppercase version of inputStr is : " + inputStr.toUpperCase());
    }
}