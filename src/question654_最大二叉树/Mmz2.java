package question654_最大二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/2 22:37
 * @Created by mmz
 */
public class Mmz2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }

        int max = 0;
        int index = 0;
        for(int i = 0;i<nums.length;++i){
            if(nums[i] >max){
                max = nums[i];
                index = i;
            }
        }

        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = core(nums,0,index-1);
        treeNode.right = core(nums,index+1,nums.length-1);

        return treeNode;
    }

    public TreeNode core(int[] nums,int start,int end){
        if(start > end){
            return null ;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = start;i<=end;++i){
            if(nums[i] >max){
                max = nums[i];
                index = i;
            }
        }

        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = core(nums,start,index-1);
        treeNode.right = core(nums,index+1,end);

        return treeNode;

    }
    public static void main(String[] args) {
        Mmz mmz = new Mmz();

        System.out.println(mmz.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}).val);
    }
}
