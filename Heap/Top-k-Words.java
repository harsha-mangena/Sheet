package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: words)
            map.put(s, map.getOrDefault(s, 0)+ 1);
        
        PriorityQueue<String> q = new PriorityQueue<>((w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w2.compareTo(w1) : map.get(w1) - map.get(w2));
        
		//add to the heap
        for (String word: map.keySet()){
            q.add(word);
            if (q.size() > k) q.poll();
        }
                                       
        List<String> result = new ArrayList<>();
        while (!q.isEmpty())
            result.add(q.poll());
        Collections.reverse(result);
        return result;
    }
}
