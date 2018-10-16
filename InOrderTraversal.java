package TreePackage;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
        public ArrayList inOrderTraversals(TreeNode root){
            Stack<TreeNode> stack = new Stack<>();
            boolean done=false;
            ArrayList result =new ArrayList();
            TreeNode current =root;
            while(done){
                if(current!=null){
                    stack.push(current);
                    current= current.getLeft();
                }
                else if(stack.empty()){
                    done= true;
                }
                else{
                    current= stack.pop();
                    result.add(current.getData());
                    current=current.getRight();
                }

            }
            return result;
        }

    }
