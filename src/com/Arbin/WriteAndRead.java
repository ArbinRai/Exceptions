
package com.Arbin;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.io.FileReader;
        import java.io.BufferedReader;
        import java.io.BufferedWriter;

public class WriteAndRead {

    public static void main(String[] args)/*throws IOException*/{
        try{
            FileWriter writer=new FileWriter("Biodata.txt");
            BufferedWriter bufWriter=new BufferedWriter(writer);
            bufWriter.write("Arbin Rai\n");
            bufWriter.write("Green\n");
            bufWriter.write("ITEC 2545\n");
            bufWriter.close();
/*the below commented out code should be used in the reader code and the public static void should not contain
        "throws IOException"*/
       /* try {
            FileReader reader = new FileReader("test.txt");
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (IOException ioe) {
            System.out.println("Could not open or read test.txt");
            System.out.println(ioe.toString());
        }
*/

       /* FileReader reader=new FileReader("Biodata.txt");
        BufferedReader bufReader=new BufferedReader(reader);
        String line=bufReader.readLine();
        while(line!=null){
            System.out.println(line);
            line=bufReader.readLine();
        }

        bufReader.close();*/

            FileReader reader=new FileReader("Biodata.txt");
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



    }
}
