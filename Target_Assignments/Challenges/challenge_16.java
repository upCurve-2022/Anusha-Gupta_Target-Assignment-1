package Challenges;

import java.util.HashMap;
import java.util.Scanner;

public class challenge_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(hm.containsKey(ch)){
                int temp = hm.get(ch);
                hm.put(ch, temp+1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        System.out.println("The duplicate characters in the string are:");
        for(char ch : hm.keySet()){
            if(hm.get(ch) > 1){
                System.out.println(ch);
            }
        }
    }
}