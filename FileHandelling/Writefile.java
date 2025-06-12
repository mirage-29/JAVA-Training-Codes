package FileHandelling;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
     static String filename = new String();
     static String string = new String();
    public Writefile(String str,String string)
    {
        filename = str;
        this.string = string;
        write();
    }
    public static void write() {
        
    
            try {
            FileWriter writer = new FileWriter(filename);
            writer.write(string);
            
            writer.write("\n");
            writer.close();

        } catch (IOException e) {
          System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
