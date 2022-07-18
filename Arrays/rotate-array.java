package Arrays;

class Solution {
    public static void rotateHelper(int start, int end, int[] array){
        int temp = 0;
        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotateHelper(0, nums.length-1, nums);
        rotateHelper(0, k-1, nums);
        rotateHelper(k, nums.length-1, nums);
    }
}
