public class String_7 {
    public static void main(String[] args) {
        String str = "134-10/5566 A-block, Manyata Tech-Park";
        for(int i = 1; i < str.length()-1; i++){
            if(str.charAt(i) == '-'){
                if(Character.isDigit(str.charAt(i - 1)) && Character.isDigit(str.charAt(i + 1))){
                    str = str.substring(0,i) + str.substring(i+1);
                }
            }
        }
        System.out.println("The new string becomes " + str);
    }
}
