package Trees;

import java.util.ArrayList;
import java.util.List;

class RootToNode{

    private void getPathsHelper(Node node, List<String> allPaths, String string) {
        if(node==null) return ;

        string += node.value;

        if(isLeaf(node)){
            allPaths.add(string);
        }

        getPathsHelper(node.left, allPaths, string+"->");
        getPathsHelper(node.right, allPaths, string+"->");
    }
    
    private boolean isLeaf(Node node) {
        if(node.left==null && node.right==null) return true;
        return false;
    }

    public List<String> getPaths(Node node){
        
        List<String> allPaths = new ArrayList<String>();
        if(node==null) return allPaths;

        getPathsHelper(node, allPaths, "");

        return allPaths;
    }
}
