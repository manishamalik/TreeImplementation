package TreePackage;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int data){
        this.data= data;
        left=null;
        right= null;
    }
    public void setData(int data1){
        this.data=data1;
    }
    public int getData(){
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
