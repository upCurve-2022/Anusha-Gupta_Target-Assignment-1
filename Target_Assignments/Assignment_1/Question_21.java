package Assignment_1;

import java.util.Scanner;

public class Question_21 {
    public static void main(String args[]){
        //1, -2, 6, -15, 31, -56 .............. N
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        int n = sc.nextInt();

        int aF = 1, prev = 1;

        for(int i =1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(prev * -1 + " ");
            }
            else{
                System.out.print(prev + " ");
            }

            aF = i * i;
            prev += aF;
        }

    }
}
