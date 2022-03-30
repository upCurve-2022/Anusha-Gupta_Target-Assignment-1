package Challenges;

import java.io.FileOutputStream;

public class challenge_9 {
    public static void main(String args[]){
        try{
            FileOutputStream fobj = new FileOutputStream("f1.txt");
            String s = "I am the file data to be written";
            byte b[] = s.getBytes();
            fobj.write(b);
            fobj.close();
            System.out.println("Data is written successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}