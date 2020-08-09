package jianzhi53_在排序数组中查找数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 20:37
 * @Created by mmz
 */
public class Mmz {
    public int search(int[] nums, int target) {
        if(nums == null ||  nums.length <=0){
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                int count = 1;
                int first =mid;
                while (first-1>=0 && nums[first-1] == target){
                    first--;
                    count++;
                }
                int last = mid;
                while(last+1 <nums.length && nums[last+1] == target){
                    last++;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
