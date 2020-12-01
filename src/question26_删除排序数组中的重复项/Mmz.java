package question26_删除排序数组中的重复项;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/31 0:04
 * @Created by mmz
 *
 * 112223333
 */
public class Mmz {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <=0){
            return 0;
        }
        int i = 0;
        for(int j = 0 ;j<nums.length;++j){
            if(core(nums[j])){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public boolean core(int num){
        for(int i =2;i<=num/2;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.removeDuplicates(new int[]{3,5,11,12});
    }
}
