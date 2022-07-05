package Trees;

import java.util.ArrayList;
import java.util.List;

class RightViewofTree {
    

    private void rightViewHelper(Node node, List<Integer> views, int level){
        if(node==null) return;

        /**
         * If the level is equal to size of the views, then we have encountered the left most node in out current level.
         * Note : A left view may contain a right, right.
         */

         if(level == views.size()){
            views.add(node.value);
         }

        //Right sub tree
        rightViewHelper(node.right, views, level+1);
        
        //Left sub tree
        rightViewHelper(node.left, views, level);
    }
    
    /***
     * Left View of a tree.
     * @param node
     * @return
     */
    public List<Integer> getRightViewOfTree(Node node){
        //Edge Case
        if(node==null) return new ArrayList<Integer>();

        List<Integer> rightViews = new ArrayList<Integer>();

        rightViewHelper(node, rightViews, 1);

        return rightViews;
    }
}
