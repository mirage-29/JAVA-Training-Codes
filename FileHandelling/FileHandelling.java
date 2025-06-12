package FileHandelling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandelling {
    public static void main(String[] args) {
        try {
            File file  = new File("file.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("HIII MY name is Raunak Mishra\n");
            
            writer.write("I am a software Engineer");
            writer.close();

        } catch (IOException e) {
          System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }

        File file = new File("file.txt"); 
        try {
           Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
        {
            String str = sc.nextLine();
            System.out.println(str);

        }
        } catch (FileNotFoundException e) {
           System.err.println("Error while Reading");
            e.printStackTrace();
        }
       
        
        
    }
}
