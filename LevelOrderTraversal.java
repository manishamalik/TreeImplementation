package TreePackage;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if (node!=null) {
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                System.out.print(node.getData()+", ");
            }
            else if(node==null && queue.isEmpty()) {
                break;
            }
            else{
                queue.add(null);
                System.out.println();
            }
        }
    }
}
