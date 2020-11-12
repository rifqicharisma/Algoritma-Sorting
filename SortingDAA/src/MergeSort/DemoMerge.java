/*
 Author : Upik
            Hasna
            Rifqi
            Maya
 */

package MergeSort;

import SelectionSort.DemoSelection;

import java.util.Random;
import java.util.Scanner;

public class DemoMerge {
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
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

        DemoMerge demoMerge = new DemoMerge();
        demoMerge.Random(X, input);
        demoMerge.sort(X, 0 , X.length-1);
        demoMerge.cetakArray(X, input);

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
