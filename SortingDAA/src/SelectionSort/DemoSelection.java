package SelectionSort;

import InsertionSort.DemoInsertion;

import java.util.Random;
import java.util.Scanner;

public class DemoSelection {
    // algoritma selection sort
    void selectionSort(int array[]){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            // find minimum element
            int minimum = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minimum]){
                    minimum = j;
                }
            }
            // swap the found element with the first
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
    }
    // input array random
    static public void Random(int[] X, int n) {
        Random rand = new Random();

        int panjang = n;

        System.out.println("Array Acak\t:");
        for (int i = 0; i < panjang; i++) {
            int arayAcak = rand.nextInt(n);
            X[i] = arayAcak;
            System.out.print(" " + X[i] + " ");
        }
        System.out.println();
    }

    // cetak array
    public static void cetakArray(int[] X, int n) {
        Random rand = new Random();

        int nilai = n;
        System.out.println("Array Sorting\t:");
        for (int i = 0; i < nilai; i++) {
            System.out.print(" " + X[i] + " ");
        }
    }

    public static void main(String[] args) {
        //input array
        Scanner scan = new Scanner(System.in);
        System.out.print("Ukuran Input Array : ");
        int input = scan.nextInt();

        //atribut array
        int[] X = new int[input];

        DemoSelection demoSelection = new DemoSelection();
        demoSelection.Random(X, input);
        demoSelection.selectionSort(X);
        demoSelection.cetakArray(X, input);

        System.out.println();
        final long startTime = System.currentTimeMillis();
        int l = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    l++;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("waktu eksekusi program: " + (endTime - startTime) + " ms");
    }
}
