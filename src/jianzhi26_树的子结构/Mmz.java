package jianzhi26_树的子结构;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:12
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null){
            return false;
        }
        if(B == null){
            return false;
        }
        if(Core(A,B)){
            return true;
        }else{
            return isSubStructure(A.left,B) || isSubStructure(A.right,B);
        }
    }

    public boolean Core(TreeNode a, TreeNode b){
        if(a == null && b != null ){
            return false;
        }
        if(b == null){
            return true;
        }
        if(a.val ==b.val){
            return Core(a.left,b.left)&&Core(a.right,b.right);
        }else{
            return false;
        }
    }
}
