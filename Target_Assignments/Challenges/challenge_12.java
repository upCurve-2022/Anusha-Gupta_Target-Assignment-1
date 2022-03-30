import java.util.Scanner;

public class challenge_12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string-1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter string-2 :");
        String str2 = sc.nextLine();
        String concatenated = str1 + str2;
        System.out.println("Concatenated string is : " + concatenated);
    }
}