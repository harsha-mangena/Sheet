package Arrays;

class Solution {
    public int[] twoSum(int[] number, int target) {
        int i=0, j=number.length-1;
        while(i < j){
            if(number[i] + number[j] == target){
                return new int[]{i+1, j+1};
            }
            
            else if(number[i] + number[j] > target){
                 j-= 1;
            }
            else{
                i += 1;
            }
        }
        return new int[]{-1, -1};
    }
}
