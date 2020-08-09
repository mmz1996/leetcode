package question213_打家劫舍二;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/6 2:19
 * @Created by mmz
 */
public class Mmz {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int m1 = Core(nums,1,nums.length);
        int m2 = Core(nums,0,nums.length-1);
        System.out.println(m1);
        System.out.println(m2);
        return Math.max(m1,m2);
    }

    public int Core(int[] nums,int start,int end){
        int pre = 0,cur = 0,tmp;
        for(int i =start;i<end;++i){
            tmp = cur;
            cur =Math.max(pre+nums[i],cur);
            pre = tmp;
        }
        return cur;
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        mmz.rob(new int[]{2,3,2});
    }
}
