package jianzhi53_0到n缺失的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 20:29
 * @Created by mmz
 */
public class Mmz {
    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid == nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
