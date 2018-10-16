package TreePackage;

import TreePackage.TreeNode;

public class TreeMain {
    public static void main(String args[])
    {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));
        root.getRight().getRight().setRight(new TreeNode(8));


//        ---------------------------LevelOrderTraversal---------------------------------
        LevelOrderTraversal levelOrder = new LevelOrderTraversal();
        levelOrder.levelOrderTraversal(root);
//        -------------------------MirrorOfBinaryTree--------------------------------------
//        MirrorOfBinaryTree mirrorOfBinaryTree = new MirrorOfBinaryTree();
//        TreeNode root2= mirrorOfBinaryTree.findMirrorOfTree(root);
//        System.out.println("mirror of binary Tree= ");
//        levelOrder.levelOrderTraversal(root2);
//        -------------------------------SumOfElementOfTree--------------------------------------
//        SumOfElementOfTree sumOfElementOfTree = new SumOfElementOfTree();
//        System.out.println("Sum of elements of tree="+sumOfElementOfTree.findSumOfElement(root));
//        -------------------------------MaximumHeight of root ----------------------------
//        MaximumHeight maximumHeight = new MaximumHeight();
//        System.out.println("height of root="+maximumHeight.findMaximumHeight(root));
//        -------------------------StructuralSimilarity--------------------------------------
//        TreeNode root1 = new TreeNode(1);
//        root1.setLeft(new TreeNode(2));
//        root1.setRight(new TreeNode(2));
//        root1.getLeft().setLeft(new TreeNode(2));
//        root1.getLeft().setRight(new TreeNode(2));
//        root1.getRight().setLeft(new TreeNode(2));
//        root1.getRight().setRight(new TreeNode(2));
//        root1.getLeft().getLeft().setLeft(new TreeNode(2));
//        StructuralSimilarity structuralSimilarity = new StructuralSimilarity();
//        System.out.println(structuralSimilarity.findStructuralSimilarity(root1,root));


    }
}
