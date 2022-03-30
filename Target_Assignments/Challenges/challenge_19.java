import java.util.Scanner;

public class challenge_19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        while(n > 1){
            if(n%2 == 0){
                n = n/2;
            }
            else if(n % 3 == 0){
                n = n /3;
            }
            else if(n % 5 == 0){
                n = n /5;
            }
            else{
                System.out.println( "The number is not an ugly number");
                break;
            }
        }

        if(n == 1){
            System.out.println("The number is an ugly number");
        }
    }
}