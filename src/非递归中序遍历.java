import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname 非递归中序遍历
 * @Description TODO
 * @Date 2020/9/9 13:50
 * @Created by mmz
 */
public class 非递归中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer>  list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode top = null;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            top = stack.pop();
            list.add(top.val);
            cur = top.right;
        }
        return list;
    }
}
