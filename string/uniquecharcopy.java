package String;

public class uniquecharcopy {
    public static void main(String[] args) {
        String str = "hellllloooo";
        String NewStr = ""; // Initialize an empty string to store unique characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            if (NewStr.indexOf(ch) == -1) { // Check if the character is not already in NewStr
                NewStr += ch; // Append the unique character to NewStr
            }
        }
        System.out.println("Original String: " + str); 
        System.out.println("String with unique characters: " + NewStr); 
    }
}
