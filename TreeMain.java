package TreePackage;

public class TreeMain {
    public static void main(String args[])
    {
        TreeNode tree = new TreeNode(1);
        tree.setLeft(new TreeNode(2));
        tree.setRight(new TreeNode(3));
        tree.getLeft().setLeft(new TreeNode(4));
        tree.getLeft().setRight(new TreeNode(5));
        tree.getRight().setLeft(new TreeNode(6));
        tree.getRight().setRight(new TreeNode(7));
        tree.getRight().getRight().setRight(new TreeNode(9));

//        ---------------------------LevelOrderTraversal---------------------------------
//        LevelOrderTraversal levelOrder = new LevelOrderTraversal();
//        levelOrder.levelOrderTraversal(tree);
//        -------------------------------MaximumHeight of Tree ----------------------------
//        MaximumHeight maximumHeight = new MaximumHeight();
//        System.out.println("height of Tree="+maximumHeight.findMaximumHeight(tree));
    }
}
