import java.util.Scanner;

public class String_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("The strings are unequal");
        }

        else{
            for(int i = 0; i < (str1.length()); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    if(str1.charAt(i) > str2.charAt(i)){
                        System.out.println("String 1 is greater");
                    }
                    else{
                        System.out.println("String 2 is greater");
                    }
                }
                else if(i == str1.length() - 1){
                    System.out.println("The strings are equal");
                }
            }
        }

    }
}
