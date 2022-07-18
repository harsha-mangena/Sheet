package Arrays;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximum = 0;
        for(int n : nums){
            if(n==1){
                count += 1;
            }
            
            else{
                count = 0;
            }
            
            maximum = Math.max(maximum, count);
        }
        return maximum;
    }
}
