package LinkedList;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numComponents(Node head, int[] G) {
        Set<Integer> setG = new HashSet<>();
        for (int i: G) setG.add(i);
        int res = 0;
        while (head != null) {
            if (setG.contains(head.value) && (head.next == null || !setG.contains(head.next.value))) res++;
            head = head.next;
        }
        return res;
    }

}
