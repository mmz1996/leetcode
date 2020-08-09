package question287_寻找重复数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 0:57
 * @Created by mmz
 */
public class Mmz {
    //1 1 2 3 4
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end =nums.length;

        while(start<=end){
            int mid = (start+end)/2;
            int count = Core(nums,start,mid);
            if(start == end){
                if(count >1){
                    return start;
                }else{
                    break;
                }
            }
            if(count > mid-start+1){
                end = mid ;
            }else{
                start = mid+1;
            }
        }
        return -1;



    }

    public int Core(int[] nums,int start,int mid){
        int count = 0;
        for(int i = 0 ;i<nums.length;++i){
            if(nums[i] >=start && nums[i]<=mid){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
