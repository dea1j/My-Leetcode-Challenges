class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output_sorted_array = new int[nums.length];
		// two pointers : start and end
		int start = 0;
		int end = nums.length - 1;
		int index = nums.length - 1;
		while (start <= end) {
			if (Math.abs(nums[start]) < Math.abs(nums[end])) {
				output_sorted_array[index] = nums[end] * nums[end];
				end--;
			} else {
				output_sorted_array[index] = nums[start] * nums[start];
				start++;
			}
			index--;
		}
		return output_sorted_array;
    }
}