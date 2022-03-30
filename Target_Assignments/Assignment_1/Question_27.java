package Assignment_1;

public class Question_27 {
    public static void main(String args[]) {
        System.out.println("Three digit armstrong numbers are :");
        for(int i = 100; i <= 999; i++){
            int x = i;
            int sum = 0;
            while(x > 0){
                int rem = x % 10;
                sum += Math.pow(rem, 3);
                x /= 10;
            }
            //System.out.println(i + " " + sum);
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }

}
