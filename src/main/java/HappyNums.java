public class HappyNums {

    public boolean showHappyNums(int nums) {
        do {
            nums = calcSumSquare(nums);
        }while (nums >= 10);
        {
            return nums == 1;
        }
    }

    public int calcSumSquare(int nums){
        int numsFirst = nums;
        String str = Integer.toString(nums);
        String[] arr = str.split("(?!^)");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
            int values = arr1[i] * arr1[i];
            nums += values;
        }
        return nums - numsFirst;
    }
}
