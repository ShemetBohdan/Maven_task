public class MaximumValue extends SortBubble{

    public int calMaxElem(int[] nums) {

        sortBubble(nums);
        int a = 0;
        int b = a;
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= maxValue) {
                a = nums[i];
                maxValue = nums[i];
            }
        }
        maxValue = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] >= maxValue) {
                b = nums[i];
                maxValue = nums[i];
            }
        }
        return (a-1) * (b-1);
    }
}
