package Challenges;

import java.util.ArrayList;

public class challenge_15{
    public static void perm(String input, String ans){
//        if(ans.length() == input.length()){
//            ArrayList<String> base = new ArrayList<>();
//            base.add(ans);
//            return base;
//        }
        if (input.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String ros = input.substring(0, i) + input.substring(i + 1);
            perm(ros, ans + ch);
        }

    }
    public static void main(String[] args) {
        String str = "GOD";
        perm(str, "");
    }
}