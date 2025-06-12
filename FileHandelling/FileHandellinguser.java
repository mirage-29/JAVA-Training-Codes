package FileHandelling;

import java.util.Scanner;

public class FileHandellinguser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Create file");
            System.out.println("2.Write file");
            System.out.println("3.Read file");
            System.out.println("4.EXIT");
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter file name with path");
                    String filenamestr1 = sc.nextLine(); // idk why its skipping first input
                    filenamestr1 = sc.nextLine();
                    Createfile file = new Createfile(filenamestr1);
                    break;
                case 2:
                    System.out.println("Enter file name ");
                    String filenamestr2 = sc.nextLine();
                    filenamestr2 = sc.nextLine(); // idk why its skipping first input
                    System.out.println("Enter Line to write ");
                    String str = sc.nextLine();
                    Writefile file1 = new Writefile(filenamestr2, str);
                    break;
                case 3:
                    System.out.println("Enter file name with path");
                    String filenamestr3 = sc.nextLine();
                    filenamestr3 = sc.nextLine(); // idk why its skipping first input
                    Readfile file3 = new Readfile(filenamestr3);
                    break;
                    case 4 : System.out.println("Goodbye Sir");
                    break;
                default:
                    System.out.println("Invalid input ");

            }

        } while (choice != 4);

    }
}
