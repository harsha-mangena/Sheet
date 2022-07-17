package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isMajority(int number, int l, int[] arr){
        int count = 0;
        for(int n : arr){
            if(n == number){
                count +=1;
            }
        }
        return count > l/3;
    }
    public List<Integer> majorityElement(int[] nums) {
        int element1=0, element2=0;
        int count1=0, count2=0;
        
        for(int number : nums){
            if(element1==number)  count1+=1;
            else if(element2==number) count2+=1;
            
            else if(count1==0){
                element1=number;
                count1+=1;
            }
            
            else if(count2==0){
                element2=number;
                count2+=1;
            }
            
            else{
                count1-=1;
                count2-=1;
            }
        }
        
        List<Integer> output = new ArrayList<>();
        
        if(isMajority(element1, nums.length, nums)){
            output.add(element1);
        }
        
        if(element1==element2) return output;
        
        if(isMajority(element2, nums.length, nums)){
            output.add(element2);
        }
        
        return output;
    }
}
