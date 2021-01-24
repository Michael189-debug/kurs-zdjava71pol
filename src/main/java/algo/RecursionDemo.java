package algo;

public class RecursionDemo {
    public static void printArray(int[] array, int start) {
        System.out.print(array[start] + " ");
        if (start + 1 < array.length) {
            printArray(array, start + 1);
        }
    }

    public static void printNumber(int start) {
        System.out.println(start);
        if (start >= 100) {
            return;
        }
        printNumber(start + 1);

    }

    public static int sumOfArray(int[] arr, int start) {
        // jeśli indeks jest spoza zakresu tablicy to zwróć zero
        if (start<0 || start > arr.length){
            return 0;
        }
        // suma elementu + suma pozostałej części tablicy
        return arr[start] + sumOfArray(arr, start + 1);
    }


    public static void main(String[] args) {
//        printArray(new int[]{1, 2, 3, 4, 5}, 0);
        printNumber(10);
        System.out.println("Koniec");
    }


}
