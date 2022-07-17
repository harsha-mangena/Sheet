package Arrays;

class Solution {
    public int majorityElement(int[] nums) {    
        int count = 0;
        int element = 0;
        for(int number : nums){
            if(count == 0){
                element = number;
            }
            
            if(element == number){
                count += 1;
            }
            
            else{
                count -= 1;
            }
        }
        return element;
    }
}