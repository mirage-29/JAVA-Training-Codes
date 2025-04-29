public class Sortingchar {
    public static void main(String[] args) {

        String[] str = { "A", "C", "B" };
        str = BubbleSort(str);
        for (String i : str) {
            System.out.print(i + "\t");
        }

    }

    static String[] BubbleSort(String[] str) {
        int i, j;
        String temp;
        for (i = 0; i < str.length; i++) {
            for (j = 0; j < str.length - 1 - i; j++) {
                if (str[j].charAt(0) > str[j + 1].charAt(0)) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;

                }
            }
        }
        return str;

    }
}