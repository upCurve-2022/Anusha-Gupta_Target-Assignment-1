import java.util.Scanner;

public class String_3 {
    //function to check if a string contains only digit
    public static boolean containsDigit(String input){
        if(input.length() == 0){
            return false;
        }
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(!(ch >= '1' && ch <= '9')){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the string to be checked");
        String inputStr = sc.nextLine();
        boolean ans = containsDigit(inputStr);
        if(ans){
            System.out.println("Conatins only digits");
        }
        else{
            System.out.println("Contains characters other than digits");
        }
    }
}
