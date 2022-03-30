package Assignment_1;

import java.util.Scanner;

public class Question_29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int search = sc.nextInt();

        int i = 0, j = arr.length -1;
        boolean flag = false;

        while(i <= j){
            int mid = (i + j)/2;
            if(arr[mid] == search){
                System.out.println("The search is successful");
                flag = true;
                break;
            }
            else if(arr[mid] > search){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }

        }
        if(!flag){
            System.out.println("The search is unsuccessful");
        }
    }
}
