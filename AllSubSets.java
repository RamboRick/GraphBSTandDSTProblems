package basic07;
import java.util.*;
public class AllSubSets {
    public List<String> findAllSubSet(String input) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(0, input, res, sb);
        return res;
    }
    public void dfs(int idx,String input, List<String> res, StringBuilder sb){
        //base case
        if(idx == input.length()){
            res.add(new String(sb));
            return;
        }
        sb.append(input.charAt(idx));
        dfs(idx+1,input,res,sb);
        sb.deleteCharAt(sb.length() -1);
        dfs(idx+1,input,res,sb);
        return
    }

}
