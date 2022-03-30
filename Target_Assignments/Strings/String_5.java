import java.util.Scanner;

public class String_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int lengthOfStr = 0;
        char[] temp = inputStr.toCharArray();

        for(char ch : temp){
            lengthOfStr++;
        }
        System.out.println("The length of the string " + inputStr + " is " + lengthOfStr);
    }
}
