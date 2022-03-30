import java.util.Scanner;

public class challenge_13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = sc.nextLine();
        
        String arr[] = input.split("");
        System.out.println("The number of words in given string is : " + arr.length);
    }
}