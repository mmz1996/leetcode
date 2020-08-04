package question113_路径总和二;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/4 0:41
 * @Created by mmz
 */
public class Mmz {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return lists;
        }
        Core(root,sum,new ArrayList<>());
        return lists;
    }

    public void Core(TreeNode root ,int index,List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        if(root.val == index && root.left == null && root.right == null){
            lists.add(new ArrayList<>(list));
        }


        Core(root.left,index-root.val,list);
        Core(root.right,index-root.val,list);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        TreeNode a =new TreeNode(5);
        TreeNode b =new TreeNode(4);
        TreeNode c =new TreeNode(8);
        TreeNode d =new TreeNode(11);
        TreeNode e =new TreeNode(13);
        TreeNode f =new TreeNode(4);
        TreeNode g =new TreeNode(7);
        TreeNode h =new TreeNode(2);
        TreeNode i =new TreeNode(5);
        TreeNode j =new TreeNode(1);

        a.left = b;
        a.right =c;
        b.left =d;
        c.left =e;
        c.right=f;
        d.left=g;
        d.right=h;
        f.left =i;
        f.right =j;
        mmz.pathSum(a,22);
    }
}
