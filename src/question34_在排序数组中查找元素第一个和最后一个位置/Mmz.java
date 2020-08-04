package question34_在排序数组中查找元素第一个和最后一个位置;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/1 17:49
 * @Created by mmz
 */
public class Mmz {
    public int[] searchRange(int[] nums, int target) {
        int start = CoreFirst(nums,0,nums.length-1,target);
        int end = CoreLast(nums,0,nums.length-1,target);
        return new int[]{start,end};

    }


    public int CoreFirst(int[] nums,int start,int end,int target){
        if(start>end){
            return -1;
        }
        while(start<end){
            int mid = (start+end)/2;
            int midnum = nums[mid];
            if(midnum == target){
                while(midnum>=0 && nums[midnum] == target){
                    midnum--;
                }
                return midnum+1;
            }else if(midnum <target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public int CoreLast(int[] nums,int start,int end,int target){
        if(start>end){
            return -1;
        }
        while(start<end){
            int mid = (start+end)/2;
            int midnum = nums[mid];
            if(midnum == target){
                while(midnum<nums.length && nums[midnum] == target ){
                    midnum++;
                }
                return midnum-1;
            }else if(midnum <target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        mmz.searchRange(new int[]{5,7,7,8,8,10},8);
    }
}
