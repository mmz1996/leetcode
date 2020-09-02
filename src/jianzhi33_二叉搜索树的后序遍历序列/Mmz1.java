package jianzhi33_二叉搜索树的后序遍历序列;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/1 22:16
 * @Created by mmz
 */
public class Mmz1 {
    public boolean verifyPostorder(int[] postorder) {
        return core(postorder,0,postorder.length-1);
    }

    public boolean core(int[] arr,int start,int end){
        if(start>=end){
            return true;
        }

        int first = start;
        while(arr[first] <arr[end]){
            first++;
        }
        int last = first;
        while(arr[first] > arr[end]){
            first++;
        }

        return first == start && core(arr,start,last-1) && core(arr,last,end-1);
    }
}
