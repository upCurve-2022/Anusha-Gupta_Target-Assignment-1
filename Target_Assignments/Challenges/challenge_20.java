public class challenge_20{
    public static void main(String args[]){
        String input = "I am always ready to learn although I do not always like being taught.";

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            
            if(ch == 'a'){
                ans.append('$');
            }
            else{
                ans.append(ch);
            }
        }

        System.out.println("The formatted string is : " + ans );
    }
}