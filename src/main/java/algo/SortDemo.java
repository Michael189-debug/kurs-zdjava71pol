package algo;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {
    public static void main(String[] args) {
        final int n = 10_000_000;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(n);
        }
        //printArray(arr);          //Wywołanie argumentu
        System.out.println("Szuaknie w tablicy nieposortowanej");
        long startTime = System.currentTimeMillis();
        for (int number : arr) {
            if (number == 10000) {
                System.out.println("JEST");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Czas trwania " + (endTime - startTime));
        System.out.println("Sortujemy tablicę");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Czas trwania " + (endTime - startTime));
        System.out.println("Wyszukujemy binarnie");
        startTime = System.nanoTime();
        Arrays.binarySearch(arr, 10000);
        endTime = System.nanoTime();
        System.out.println("Czas trwania " + (endTime - startTime + " w ns"));
        System.out.println();
        System.out.println("****************************");
        //printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
