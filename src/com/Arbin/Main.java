package com.Arbin;
import java.awt.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       try{
           FileReader reader;
           reader = new FileReader("Biodata.txt");
           BufferedReader bufReader=new BufferedReader(reader);
           String line=bufReader.readLine();

           while(line !=null){
               System.out.println(line);
               line=bufReader.readLine();

           }
       bufReader.close();
       }
       catch (IOException ioe){
           System.out.println("Could not open or read \"Biodata.txt\"");
           System.out.println((ioe.toString()));
       }
        System.out.println("If the code did not work, the program did not crash ");
        System.out.println("The program keeps running so could perhaps ask the user to create this file, or specify the file location location");

        String[] names={"A","B","C"};

        try{
            for (int i = 0 ; i <= 3 ; i++) { //error is at i<=3
                System.out.println(names[i]);
            }
            System.out.println("End of loop");
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Oops, tried to print too many names");
        }
        System.out.println("That's the end of the list of names");
    }
}
