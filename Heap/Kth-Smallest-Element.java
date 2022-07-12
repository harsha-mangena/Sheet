package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    /***
     * Naive method -> O(NlogN), O(1)
     * Sort the array, return array[k-1]
     * @param array
     * @param k
     * @return
     */
    public int KthSmallestElementUsingSorting(int[] array, int k){
        int result = 0;
        Arrays.sort(array);
        result = array[k-1];
        return result;
    }

    /**
     * Efficient : Use Max Heap, add elements to heap, if at any point heap.size() > k, remove top element.
     * @param array
     * @param k
     * @return
     */
    public int KthSmallestElement(int[] array, int k){
        int result = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int i=0; i<array.length; i++){
            maxHeap.add(array[i]);

            if(maxHeap.size() > k){
                maxHeap.remove();
            }
        }
        result = maxHeap.peek();
        return result;
    }
}
