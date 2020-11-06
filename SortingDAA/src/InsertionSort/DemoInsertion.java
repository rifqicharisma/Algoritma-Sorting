package InsertionSort;
import java.util.Random;
import java.util.Scanner;

public class DemoInsertion {
    // algoritma insertion sort
    void insertionSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int key = array[i];
            int j = i-1;
            // swipe
            while (j >= 0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
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

        DemoInsertion demoInsertion = new DemoInsertion();
        demoInsertion.Random(X, input);
        demoInsertion.insertionSort(X);
        demoInsertion.cetakArray(X, input);

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

