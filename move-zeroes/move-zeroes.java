class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1) {
            return;
        }

        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (insertPos != i) {
                    nums[insertPos] = nums[i];
                    nums[i] = 0;
                }
                insertPos++;
            }
        }
    }
}