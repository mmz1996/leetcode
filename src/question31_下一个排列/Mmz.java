package question31_下一个排列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/20 21:54
 * @Created by mmz
 */
public class Mmz {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;

        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }

        reverse(nums,i+1);
    }

    public void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void reverse(int[] nums,int index){
        int start =index;
        int end = nums.length-1;

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
