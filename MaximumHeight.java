package TreePackage;

public class MaximumHeight {
    public int findMaximumHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int leftHeight = findMaximumHeight(root.getLeft());
            int rightHeight = findMaximumHeight(root.getRight());
            return (leftHeight<rightHeight) ? rightHeight+1 : leftHeight+1;
        }
    }
}
