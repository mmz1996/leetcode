//package question98_验证二叉树;
//
///**
// * @Classname Mmz
// * @Description TODO
// * @Date 2020/8/22 18:11
// * @Created by mmz
// */
//public class Mmz {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) { val = x; }
//    }
//
//    public boolean isValidBST(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//
//        return core(root,null,null);
//    }
//
//    public boolean core(TreeNode root ,Integer lower,Integer upper){
//        if(root == null){
//            return true ;
//        }
//
//        if(lower != null && root.val <=lower){
//            return false;
//        }
//
//        if(upper != null && root.val >=upper){
//            return false;
//        }
//
//        if(!core(root.left,lower,root.val)){
//            return false;
//        }
//
//        if(!core(root.right,root.val,upper)){
//            return false;
//        }
//
//        return true;
//
//        String
//    }
//
//}
