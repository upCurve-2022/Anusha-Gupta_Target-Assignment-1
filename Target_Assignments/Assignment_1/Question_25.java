package Assignment_1;

import java.util.Scanner;

public class Question_25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        StringBuffer revStr = new StringBuffer();

        for (int i = str.length()-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }

        System.out.println("After reversing the string " + str + ", the reversed string is " + revStr);
    }
}
