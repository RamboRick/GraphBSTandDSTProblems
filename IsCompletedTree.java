package basic07;
import java.util.*;
//time: O(n)
//space: O(n)
public class IsCompletedTree {
    public boolean isCompleted(TreeNode root){
        if(root == null){
            return true
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean metN = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr.left == null && curr.right != null){
                return false;
            }
            if(metN && (curr.left !=null || curr.right != null)){
                return false;
            }
            if(curr.left == null || curr.right == null){
                metN = true;
            }
            if(curr.left != null){
                queue.offer(curr.left);
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
        }
        return true;
    }
}
