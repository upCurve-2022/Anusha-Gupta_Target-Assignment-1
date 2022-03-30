package Challenges;

import java.io.*;

public class challenge_8{
    public static void main(String args[]){
        File file = new File("f2.txt");
        boolean result;
        try{
            result = file.createNewFile();
            if(result)
            {
                System.out.println("file created successfully");
            }
            else
            {
                System.out.println("File already exist at location");
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
        

