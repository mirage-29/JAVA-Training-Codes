public class arraymerge {

        public static void main(String[] args) {
            int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] a2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] a3 = new int[a1.length +a2.length];
for(int i=0,j=0;i<a3.length;i++,j++)
{
    if(j<a1.length)
{
    a3[i]=a1[j];

}
else 
a3[i]=a2[j];

}
for (int i = 0; i < a3.length; i++) {
    System.out.print(a3[i] + "\t");
}
}
}
