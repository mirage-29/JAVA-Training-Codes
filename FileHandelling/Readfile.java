package FileHandelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
    static String filename = new String();
    public Readfile(String str){
        filename = str;
        read();
    }
    public static void read() {
        
    
             File file = new File(filename); 
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
