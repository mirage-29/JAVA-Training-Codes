

import java.util.Scanner;

public class Reliability {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Take predefined values ? \n Enter 1 to use predefined values : ");
        int x = sc.nextInt();
        if (x != 1) {
            System.out.print("Enter number of devices  : ");
            int n = sc.nextInt();
            double Reliability[] = new double[n];
            int Cost[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Reliability of " + (i + 1) + " Device : ");
                Reliability[i] = sc.nextDouble();
                System.out.print("Enter Cost of " + (i + 1) + " Device : ");
                Cost[i] = sc.nextInt();
            }
            System.out.print("Enter Maximum cost : ");
            final int Maxcost = sc.nextInt();
            Reliable(n, Cost, Reliability, Maxcost);
        } else {
            double Reliability[] = {0.8, 0.7, 0.9};
            int Cost[] = {20, 15, 30};
            final int Maxcost = 100;
            int n = 3;
            Reliable(n, Cost, Reliability, Maxcost);
        }
    }

    public static void Reliable(int n, int[] Cost, double[] Reliability, int Maxcost) {
        System.out.println("\n  \tReliability\tCost");
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

        // Start generating all possible combinations using tuple method
        int[] bestCombination = new int[n];
        double bestReliability = 0.0;

        int[] copies = new int[n];
        generateTuples(0, n, copies, maxcopies, Cost, Reliability, Maxcost, bestCombination, new double[]{bestReliability});

        // Display best result
        System.out.println("\nBest Combination:");
        for (int i = 0; i < n; i++) {
            System.out.println("Device " + (i + 1) + " copies: " + bestCombination[i]);
        }

        double finalReliability = calculateSystemReliability(bestCombination, Reliability);
        int finalCost = calculateTotalCost(bestCombination, Cost);
        System.out.println("Max Reliability: " + finalReliability);
        System.out.println("Total Cost: " + finalCost);
    }

    public static void generateTuples(int index, int n, int[] copies, int[] maxcopies, int[] Cost, double[] Reliability, int Maxcost, int[] bestCombination, double[] bestReliability) {
        if (index == n) {
            int cost = calculateTotalCost(copies, Cost);
            if (cost <= Maxcost) {
                double rel = calculateSystemReliability(copies, Reliability);
                if (rel > bestReliability[0]) {
                    bestReliability[0] = rel;
                    System.arraycopy(copies, 0, bestCombination, 0, n);
                }
            }
            return;
        }

        for (int i = 1; i <= maxcopies[index]; i++) { // Note: at least 1 copy of each device
            copies[index] = i;
            generateTuples(index + 1, n, copies, maxcopies, Cost, Reliability, Maxcost, bestCombination, bestReliability);
        }
    }

    public static int calculateTotalCost(int[] copies, int[] Cost) {
        int sum = 0;
        for (int i = 0; i < copies.length; i++) {
            sum += copies[i] * Cost[i];
        }
        return sum;
    }

    public static double calculateSystemReliability(int[] copies, double[] Reliability) {
        double total = 1.0;
        for (int i = 0; i < copies.length; i++) {
            total *= (1 - Math.pow(1 - Reliability[i], copies[i]));
        }
        return total;
    }
}
