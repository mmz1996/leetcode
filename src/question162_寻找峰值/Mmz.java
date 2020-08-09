package question162_寻找峰值;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/6 0:59
 * @Created by mmz
 */
public class Mmz {
    public int findPeakElement(int[] nums) {
        return Core(0,nums.length-1,nums);
    }

    public int Core(int left,int right,int[] nums){
        if(left == right){
            return left;
        }
        int mid = (left+right)/2;

        if(nums[mid] >nums[mid+1]){
            return Core(left,mid,nums);
        }
        System.out.println();
        return Core(mid+1,right,nums);
    }

}
