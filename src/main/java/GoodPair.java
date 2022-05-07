public class GoodPair {

    public int calcGoodPair(int[] nums) {
        int goodPair = 0;
        int sumGoodPair = goodPair;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPair = sumGoodPair + 1;
                }
                sumGoodPair = goodPair;
            }
        }
        return sumGoodPair;
    }
}