class MaxSubarray {
    public int maxSubArray(int[] nums) {

        int currSum = nums[0], maxSum = nums[0], i = 1;
        if (nums.length <= 1)
            return nums[0];

        while (i < nums.length) {

            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
            i++;
        }
        return maxSum;
    }
}