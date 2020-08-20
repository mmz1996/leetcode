import java.util.Arrays;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/8/1 20:27
 * @Created by mmz
 */
public class test {
    public int Core(int[] nums){
       for(int i = 0;i<nums.length;++i){
           while (nums[i] <=nums.length && nums[i] != nums[nums[i]-1]){
               int temp = nums[i];
               nums[i] = nums[temp-1];
               nums[temp-1] = temp;
           }
       }

       for(int i = 1;i<nums.length;++i){
           if(nums[i] != i+1){
               return i+1;
           }
       }

       return -1;
    }

    public static void main(String[] args) {
            
    }
}
