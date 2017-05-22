/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class TwoSum {
    public static void main(String[] args) {
        int inputArray[] = new int[]{2, 7, 11, 15};
        int target = 918;
        int[] twoSum = new TwoSum().twoSum(inputArray, target);
        System.out.print(twoSum);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int sum = nums[i] + nums[j];
                    if (sum == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[2];
    }
}
