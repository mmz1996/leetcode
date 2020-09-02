package question95_不同的二叉搜索树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/22 16:53
 * @Created by mmz
 */
public class Mmz {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<TreeNode> generateTrees(int n){
        if(n == 0){
            return new LinkedList<>();
        }
        return core(1,n);
    }

    public List<TreeNode> core(int start,int end){
        List<TreeNode> list = new LinkedList<>();
        if(start>end){
            list.add(null);
            return list;
        }


        for(int i = start;i<=end;++i){
            List<TreeNode> left = core(start,i-1);

            List<TreeNode> right = core(i+1,end);

            for(TreeNode lefts:left){
                for(TreeNode rights:right){
                    TreeNode cur = new TreeNode(i);
                    cur.left = lefts;
                    cur.right = rights;
                    list.add(cur);
                }
            }
        }
        return list;
    }
}
