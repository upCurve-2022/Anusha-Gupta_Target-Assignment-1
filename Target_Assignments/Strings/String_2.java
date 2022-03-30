import java.util.Scanner;
public class String_2 {
    //to remove all occurence of a given character
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input string");
        String inputStr = sc.nextLine();
        System.out.println("Enter the character whose occurence need to be removed:");
        char removeCh = sc.next().charAt(0);

        StringBuilder ans = new StringBuilder();

        //need to remove all occurences of a letter(upper and lower case)
        //ch will have the opposite case of removeCh
        int ch = (char)(removeCh > 'a' ? 'A' + (removeCh - 'a') : 'a' + (removeCh - 'A'));

        for(int i = 0; i < inputStr.length(); i++){
            if(inputStr.charAt(i) != removeCh && inputStr.charAt(i) != ch){
                //if character does not match ch or removeCh then add it to ans
                ans = ans.append(inputStr.charAt(i));
            }
        }
        System.out.println(ans);
    }


}
