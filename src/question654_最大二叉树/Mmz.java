package question654_最大二叉树;

import com.sun.org.apache.xpath.internal.objects.XNull;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 18:46
 * @Created by mmz
 */
public class Mmz {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length <=0){
            return null;
        }

        int index = 0;
        int max = 0;
        for(int i= 0;i<nums.length;++i){
            if(nums[i] >max){
                max =nums[i];
                index =i;
            }
        }

        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left =core(0,index-1,nums);
        treeNode.right = core(index+1,nums.length-1,nums);
        return treeNode;
    }

    public static TreeNode core(int start,int end,int[] nums){
        if(start>end){
            return null;
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i= start;i<=end;++i){
            if(nums[i] >max){
                max =nums[i];
                index =i;
            }
        }

        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left =core(start,index-1,nums);
        treeNode.right = core(index+1,end,nums);
        return treeNode;
    }

    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }
}
