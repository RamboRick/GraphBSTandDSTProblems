package basic07;
import java.util.*;
//time: O(n)
//space:O(n)
public class BFSBinaryTree {
    public List<List<Integer>> pringByLayer(TreeNode root){
        if(root == null){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>(); // 1 Treenode
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size(); //2 size for printing the whole layer
            List<Integer> currLayer = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll(); //3.poll the curr node and record
                currLayer.add(curr.value);
                if(curr.left != null){
                    queue.offer(curr.left); //4. generate neibors
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            res.add(currLayer);
        }
       return res;
    }
}

class TreeNode{
    public TreeNode(int v){
        value = v;
    }
    TreeNode left;
    TreeNode right;
    int value;
}

