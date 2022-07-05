package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Similar to LevelOrderTraversal, but only in zigzag fashion. I.e left to right(Level 1), right to left(Level 2) and soon.
 */
public class ZigZagTraversal {
    
    public List<List<Integer>> getZigZagTraversal(Node node){
        
        List<List<Integer>> output = new ArrayList<>();

        //Base Case
        if(node==null) return output;
        
        Queue<Node> line = new LinkedList<>();

        line.offer(node);

        int idx=0;

        while(line.size() > 0) {
            int curSize = line.size();
            List<Integer> curLevel = new ArrayList<>();

            for(int i = 0; i < curSize; i++){
                Node temp = line.poll();

                curLevel.add(temp.value);

                if(temp.left!=null){
                    line.add(temp.left);
                }

                if(temp.right!=null){
                    line.add(temp.right);
                }
            }

            if(idx%2==0){
                output.add(new ArrayList<>(curLevel));
            }

            else{
                Collections.reverse(curLevel);
                output.add(new ArrayList<>(curLevel));
            }

            idx++;
        }
        return output;
    }
}
