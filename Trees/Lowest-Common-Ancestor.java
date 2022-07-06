package Trees;

import java.util.ArrayList;
import java.util.List;

class LowestCommonAncestor {

    private void getPathsHelper(Node root, List<Node> Path, Node node) {
        if(root==null || node==root) return ;

        Path.add(root);

        getPathsHelper(root.left, Path, node);
        getPathsHelper(root.right, Path, node);
    }

    public Node findLCA(Node root1, Node node1, Node node2){
        List<Node> pathForNode1 = new ArrayList<Node>();
        List<Node> pathForNode2 = new ArrayList<Node>();

        getPathsHelper(root1, pathForNode1, node1);
        getPathsHelper(root1, pathForNode2, node2);

        for(int i = Math.min(pathForNode1.size(), pathForNode2.size())-1; i>=0; i--){
            if(pathForNode1.get(i)==pathForNode2.get(i)){
                return pathForNode1.get(i);
            }
        }

        return null;
    } 
    
}
