package TreePackage;

public class StructuralSimilarity {
    public boolean findStructuralSimilarity(TreeNode root1, TreeNode root2){
        if(root1==null && root2 ==null){
            return true;
        }
        else if(root1==null || root2==null){
            return false;
        }
        else{
            return (findStructuralSimilarity(root1.getLeft(), root2.getRight()) && findStructuralSimilarity(root1.getRight(),root2.getLeft()));
        }
    }
}
