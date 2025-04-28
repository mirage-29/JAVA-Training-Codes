public class repeatcharprint {

    public static void main(String[] args) {
        int count = -1;
        String str = "helooooool";
        for (int i = 0; i < str.length(); i++) {
           
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    //System.out.println(ch);
                    count++;
                    break;
                }
            }
            if (count == 1)
            {
                System.out.println(ch);
                break;
            }

        }

       /*  char[] chararr = str.toCharArray();

        for (int i = 0; i < chararr.length; i++) {
            int count = -1;
            char ch = chararr[i];
            for (int j = i + 1; j < chararr.length; j++) {
                if (ch == chararr[j]) {
                    System.out.println(ch);
                    count++;
                    break;
                }
            }
            if (count != -1)
                break;
        }*/
    }
}
