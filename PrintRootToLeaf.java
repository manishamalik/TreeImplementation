package TreePackage;

public class PrintRootToLeaf {
    public void printPath(TreeNode root){
        int[] path= new int[256];
        prints(root,path,0);
    }
    public void prints(TreeNode root, int[] path, int pathlen ){
        if(root==null){
            return;
        }
        path[pathlen]= root.getData();
        pathlen++;
        if(root.getLeft()==null&& root.getRight()==null){
            printArray(path,pathlen);
        }
        else {
            prints(root.getLeft(),path,pathlen);
            prints(root.getRight(),path,pathlen);
        }
    }
    public void printArray(int[]array, int len){
        for(int i=0 ;i<len;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}
