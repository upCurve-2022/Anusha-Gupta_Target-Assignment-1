package Assignment_1;

import java.util.Scanner;

public class Question_28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int search = sc.nextInt();

        boolean flag = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == search){
                System.out.println("Search is successful");
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("The search is unsuccessful");
        }
    }


}
