import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int searchNum = Integer.parseInt(scan.nextLine());

        //int result = linearSearch(array, searchNum);
        int result = binarySearch(array, searchNum);
        System.out.println(result);
    }

    private static int linearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length-1;
        while (start <= end) {
            int target = (end + start)/2;
            if (array[target] > num) {
                end = target-1;
            } else if (array[target] < num) {
                start = target+1;
            } else {
                return target;
            }

        }
        return -1;
    }
}
