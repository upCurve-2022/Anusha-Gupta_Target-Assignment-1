import java.util.Scanner;

public class String_4 {
    public static boolean isEmpty(String input){
        if(input.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputStr = sc.nextLine();

        boolean ans = isEmpty(inputStr);
        if(ans){
            System.out.println("[" + inputStr + "] is an empty string");
        }
        else{
            System.out.println("[" + inputStr + "] is not an empty string");
        }
    }
}
