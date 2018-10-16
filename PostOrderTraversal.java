package TreePackage;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    ArrayList al =new ArrayList();
    public ArrayList postOrderTraversals(TreeNode root){
        if(root!=null) {
            postOrderTraversals(root.getLeft());
            postOrderTraversals(root.getRight());
            System.out.println(root.getData());
            al.add(root.getData());
        }
        return al;
    }
}
