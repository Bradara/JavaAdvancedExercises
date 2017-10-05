import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //bubleSort(array);
        selectionSort(array);
        //insertionSort(array);
    }

    private static void selectionSort(int[] array) {
        int n = array.length;
        int index = 0;
        int min = 0;
        for (int i = 0; i < n-1; i++) {
            min = array[i];
            index = i;
            for (int j = i+1; j < n; j++) {
                if (min>array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                swap(array, i, index);
            }
        }

        print(array);
    }

    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j]<array[j-1]) {
                    swap(array, j, j-1);
                } else{
                    break;
                }
            }

        }

        print(array);
    }

    private static void bubleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }

        print(array);
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
    }

    private static void swap(int[] array, int i, int i1) {
        int temp = array[i];
        array[i] = array[i1];
        array[i1] = temp;
    }
}
