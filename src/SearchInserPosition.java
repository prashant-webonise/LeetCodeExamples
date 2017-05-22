/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */
public class SearchInserPosition {
    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 6};
        int target = 99;
        int index = searchInsert(ints, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] >= target) {
                break;
            }
        }
        return i;
    }
}
