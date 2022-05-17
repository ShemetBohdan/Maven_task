public class SquaresAndSort extends SortBubble{

    public int[] calcSquare(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        sortBubble(nums);
        return nums;
    }
}
