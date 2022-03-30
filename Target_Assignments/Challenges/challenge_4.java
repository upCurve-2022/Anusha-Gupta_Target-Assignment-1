import java.util.Scanner;

public class challenge_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character whose ascii value needs to be found : ");
        char ch = sc.next().charAt(0);
        int val = ch;
        System.out.println("The ASCII value of " + ch + " is " + val);
    }
}