package jianzhi33_二叉搜索树的后序遍历序列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/1 21:41
 * @Created by mmz
 */
public class Mmz {
    public boolean verifyPostorder(int[] postorder) {
        return core(postorder,0,postorder.length-1);
    }

    public boolean core(int[] arr,int start,int end){
        if(start>= end){
            return true;
        }
        int first = start;
        while(arr[first]<arr[end]){
            first++;
        }

        int last = first;
        while(arr[first]> arr[end]){
            first++;
        }


        return start == end && core(arr,start,last-1) && core(arr,last,end-1);
    }
}
