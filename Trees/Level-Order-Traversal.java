package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LevelOrderTraversal {
    

    public List<List<Integer>> levelOrder(Node node){
        List<List<Integer>> output = new ArrayList<>();
        //Edge Case
        if(node==null) return output;

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while(q.size() > 0){
            List<Integer> currentLevel = new ArrayList<>();
            int n = q.size();

            for(int i=0; i<n; i++){
                Node temp = q.remove();

                currentLevel.add(temp.value);

                //Left Sub Tree
                if(temp.left != null){
                    q.offer(temp.left);
                }

                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            output.add(new ArrayList<>(currentLevel));        
        }
    return output;
    }
}
