package jianzhi07_重建二叉树;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:41
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        Mmz.TreeNode left = null;
        Mmz.TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return  Core(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode Core(int[] preorder,int ps,int pe,int[] inorder,int is,int ie){
       if(ps > pe || is >ie){
           return null;
       }
       TreeNode treeNode = new TreeNode(preorder[ps]);
       int temp = 0 ;
       for(int i = 0;i<=ie;i++){
           if(preorder[ps] == inorder[is+i]){
               temp = i;
               break;
           }
       }
       treeNode.left = Core(preorder,ps+1,ps+temp,inorder,is,is+temp-1);
       treeNode.right = Core(preorder,ps+temp+1,pe,inorder,is+temp+1,ie);

       return treeNode;
    }

}
