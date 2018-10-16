package TreePackage;

public class MirrorOfBinaryTree {
    public TreeNode findMirrorOfTree(TreeNode root){
        TreeNode temp;
        if(root!=null){
            findMirrorOfTree(root.getLeft());
            findMirrorOfTree(root.getRight());
            temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }
        return root;
    }
}
