package TreePackage;

public class SumOfElementOfTree {
    public int findSumOfElement(TreeNode root){
        int sum=0;
        if(root==null){
            return sum;
        }
        else {
            sum= sum+root.getData();
            sum+=findSumOfElement(root.getLeft());
            sum+=findSumOfElement(root.getRight());
        }
        return sum;
    }
}
