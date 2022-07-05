package Trees;

import java.util.ArrayList;
import java.util.List;

class LeftViewOfTree {


    private void leftViewHelper(Node node, List<Integer> views, int level){
        if(node==null) return;

        /**
         * If the level is equal to size of the views, then we have encountered the left most node in out current level.
         * Note : A left view may contain a right, right.
         */

         if(level == views.size()){
            views.add(node.value);
         }

        //Left sub tree
        leftViewHelper(node.left, views, level+1);
        
        //right sub tree
        leftViewHelper(node.right, views, level);
    }
    
    /***
     * Left View of a tree.
     * @param node
     * @return
     */
    public List<Integer> getLeftViewOfTree(Node node){
        //Edge Case
        if(node==null) return new ArrayList<Integer>();

        List<Integer> leftViews = new ArrayList<Integer>();

        leftViewHelper(node, leftViews, 1);

        return leftViews;
    }
}
