
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname mmz20200914
 * @Description TODO
 * @Date 2020/9/14 11:43
 * @Created by mmz
 */
public class mmz20200914 {
    public static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static List<Integer> core(TreeNode root){
        List<Integer> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }

       LinkedList<TreeNode> list= new LinkedList<>();

        list.addLast(root);
        while(!list.isEmpty()){
            TreeNode now = list.pollLast();
            lists.add(now.val);
            if(now.left != null){
                list.addFirst(now.left);
            }

            if(now.right != null){
                list.addFirst(now.right);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);

        one.right = two;
        two.left = three;
        List<Integer> list =  core(one);
        for(int i:list){
            System.out.println(i);
        }

    }
}
