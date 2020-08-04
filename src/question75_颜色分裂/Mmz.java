package question75_颜色分裂;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 23:06
 * @Created by mmz
 */
public class Mmz {
    public void sortColors(int[] nums) {
        int red = 0;
        int blue = 0;
        int white =0;
        for(int i = 0 ; i<nums.length;++i){
            if(nums[i] == 0){
                red++;
            }else if(nums[i] == 1){
                white++;
            }else{
                blue++;
            }
        }

        for(int i = 0;i<red;++i){
            nums[i] = 0;
        }
        for(int i  =red;i<red+white;++i){
            nums[i] = 1;
        }
        for(int i = blue;i<red+white+blue;++i){
            nums[i]= 2;
        }

    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.sortColors(new int[]{2,0,2,1,1,0});
    }
}
