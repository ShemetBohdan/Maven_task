public class SortBubble {

    public static int[] sortBubble(int[]nums) {

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                    buf = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = buf;
                }
            }
        }
        return nums;
    }
}
