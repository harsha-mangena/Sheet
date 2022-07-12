package Heap;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i=0;
        for(int num : nums){
            minHeap.add(num);
            i++;
            if (i > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
