package Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 0;
        
        for(int i=1; i<nums.length; i++){
            if(!(nums[i-1] == nums[i])){
                index+=1;
                nums[index] = nums[i];
            }
        }
        
        return index + 1;
    }
}
