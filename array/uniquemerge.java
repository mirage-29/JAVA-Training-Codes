package Array;

public class uniquemerge {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 1 };
        int[] a2 = { 4,8,1,12,13,14,15,16 };
        int count=0;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    a1[i]=-1;
                    count++;
                }
            }
        }
        int[] a3 = new int[a1.length + a2.length - count];
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]!=-1)
             a3[i] = a1[i];
            //else i--;
            
        }
        for (int i = 0; i < a2.length; i++) {
            a3[a1.length-count+i] = a2[i];
        }
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + "\t");
        }
    }
    
}
