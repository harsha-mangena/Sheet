package Trees;

import java.util.LinkedList;
import java.util.Queue;

class HeightOfATree {

    /***
     * Height of tree using Queue
     * @param node
     * @return
     */
    public int getHeightUsingQueue(Node node){
        //Edge Case
        if(node==null) return 0;

        Queue<Node> q = new LinkedList<>();
        int height = 0;

        while(!q.isEmpty()){

            height += 1;
            int n=q.size();

            for(int i=0; i<n; i++){
                Node temp = q.remove();

                //If Left Node Exists, then add to queue
                if(temp.left != null){
                    q.add(temp.left);
                }

                //If right Node Exists, then add to queue
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }

        return height;  
    }

    /***
     * Height of tree using recursion
     * @param node
     * @return
     */
    public int getHeight(Node node){
        if(node==null) return 0;

        //Calculating for left Sub tree
        int left = getHeight(node.left);

        //Calculating for right Sub tree
        int right = getHeight(node.right);

        return Math.max(left, right) + 1;
    }
}
