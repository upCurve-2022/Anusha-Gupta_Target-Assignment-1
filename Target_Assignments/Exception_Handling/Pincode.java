import java.util.Scanner;

public class Pincode {
    int pincode;

    public Pincode(int pincode){
        this.pincode = pincode;
    }

    public void check_pincode(int pincode) throws PincodeException{
        if(String.valueOf(pincode).length() != 6){
            throw new PincodeException("This pincode is not deliverable");
        }
        else{
            System.out.println("Delivery is available in your area");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode");
        int input_pc = sc.nextInt();
        Pincode pc = new Pincode(input_pc);
        try{
            pc.check_pincode(input_pc);
        }
        catch(PincodeException e){
            System.out.println("An error occured");
            System.out.println("Exception occured: " + e);
        }

        System.out.println("Please visit again!!");
        System.out.println("Have a great day :)");



    }
}
