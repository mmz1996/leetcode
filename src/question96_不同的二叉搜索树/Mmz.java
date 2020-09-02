package question96_不同的二叉搜索树;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/22 17:03
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int numTrees(int n){
        int[] G =new int[n+1];

        G[0] = 1;
        G[1] =1;

        for(int i = 2 ;i<=n;++i){
            for(int j= 1;j<=i;++j){
                G[i] +=G[j] * G[i-j];
            }
        }

        return G[n];
    }

}
