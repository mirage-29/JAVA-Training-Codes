package MiscCodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Reliability {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Take predefined values ? \nEnter 1 to use predefined values : ");
      int x = sc.nextInt();
      if (x != 1) {
         System.out.print("Enter number of devices  : ");
         int n = sc.nextInt();
         double Reliability[] = new double[n];
         int Cost[] = new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter Reliabilty of " + (i + 1) + " Device : ");
            Reliability[i] = sc.nextDouble();
            System.out.print("Enter Cost of " + (i + 1) + "Device : ");
            Cost[i] = sc.nextInt();

         }
         System.out.print("Enter Maximum cost : ");
         final int Maxcost = sc.nextInt();
         Reliable(n, Cost, Reliability, Maxcost);

      } else {
         double Reliability[] = { 0.8, 0.7, 0.9 };
         int Cost[] = { 20, 15, 30 };
         final int Maxcost = 100;
         int n = 3;
         Reliable(n, Cost, Reliability, Maxcost);

      }

   }

   public static void Reliable(int n, int[] Cost, double[] Reliability, int Maxcost) {
      System.out.println("\n  \t" + "Reliability\t" + "Cost");
      for (int i = 0; i < n; i++) {
         System.out.println("D" + (i + 1) + "\t" + Reliability[i] + "\t\t" + Cost[i]);
      }
      int maxcopies[] = new int[n];
      int sumofcosts = 0;
      for (int i = 0; i < n; i++) {
         sumofcosts += Cost[i];
      }
      for (int i = 0; i < n; i++) {
         maxcopies[i] = (Maxcost + Cost[i] - sumofcosts) / Cost[i];
      }

      for (int i = 0; i < n; i++) {
         System.out.println("Maxcopies of Device " + (i + 1) + " : " + maxcopies[i]);
      }
      double S0[]={1,0};
    ArrayList<double[]> S11 = new ArrayList<>();
    S11.add(S0);
    S11.add(new double[]{S0[0]*Reliability[0],S0[1]+Cost[0]});
    for (double[] arr : S11) {
      System.out.println(Arrays.toString(arr));
    }

  
    

   }
}
