package FileHandelling;

import java.io.File;
import java.io.IOException;

public class Createfile {
    static String filename = new String();
    public Createfile(String str)
    {
        filename = str;
        create();
    }
        public static void create() {
        try {
            File file  = new File(filename);
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
}
}
