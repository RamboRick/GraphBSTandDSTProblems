package basic07;
import java.util.*;
class GraphNode{
    public int value;
    public int set;
    public List<GraphNode> nei;
    public boolean visited =false;

}

public class Bipart {
    public boolean isBarp(List<GraphNode> graph) {
        //gurantee not null;
        for (GraphNode node : graph) {
            if (helper(node)) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(TreeNode node){
        if(node.isVisited){
            return;
        }
        node.isVisited = true;
        node.set = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            for(TreeNode neibor : cur.nei){
                if(neibor.isVisited){
                    int expectedSet = neibor.set == 0 ? 1 : 0;
                    if(neibor.set != expectedSet){
                        return false;
                    }
                }else {
                    neibor.isVisited = true;
                    neibor.set= neibor.set == 0 ? 1:0;
                    queue.offer(neibor)
                }

            }
        }
        return true;
    }

}
