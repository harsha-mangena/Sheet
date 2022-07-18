package Arrays;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int number : nums){
            sum += number;
        }
        
        int leftCurSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (leftCurSum == sum - leftCurSum - nums[i]) return i;
            leftCurSum += nums[i];
        }
        return -1;
    }
}
