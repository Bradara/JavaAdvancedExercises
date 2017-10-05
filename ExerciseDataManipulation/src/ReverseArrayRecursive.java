import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        nums = reverse(nums);
        System.out.println(Arrays.toString(nums).replaceAll("[\\[,\\]]", ""));
    }

    private static int[] reverse(int[] nums) {
        return reverse(nums, nums.length-1);
    }

    private static int[] reverse(int[] nums, int i) {
        int len = nums.length-1;
        if (i<nums.length/2) {
            return nums;
        }

        int temp = nums[len-i];
        nums[len-i] = nums[i];
        nums[i] = temp;

         return reverse(nums, i-1);
    }
}
