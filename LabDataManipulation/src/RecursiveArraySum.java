import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = sumRecursion(nums);
        System.out.println(sum);
    }

    private static int sumRecursion(int[] nums) {
       return sumRecursion(nums, nums.length-1);
    }

    private static int sumRecursion(int[] nums, int i) {
        if (i == 0) {
            return nums[0];
        }

        return nums[i] + sumRecursion(nums, i - 1);

    }
}
