package TreePackage;

import java.util.ArrayList;

public class PreOrderTraversal {
    ArrayList<Integer> al = new ArrayList<>();
    public ArrayList<Integer> preorderTraversal(TreeNode root){
       if(root!=null){
           al.add(root.getData());
           System.out.println(root.getData());
           preorderTraversal(root.getLeft());
           preorderTraversal(root.getRight());
       }
       return al;
    }
}
