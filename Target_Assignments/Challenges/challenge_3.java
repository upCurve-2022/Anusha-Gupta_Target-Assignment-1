package Challenges;

public class challenge_3{
    public static void main(String args[]){
        int cost_price = 50;
        int discount = 12;
        double discount_price = 0.12*50;
        double selling_price = cost_price - discount_price;
        System.out.println("the discount_price is : " + discount_price);
        System.out.println("The selling price is : " + selling_price);
    }
}