package question31_下一个排列;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/12 18:27
 * @Created by mmz
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length<=0){
            return;
        }
        int index = -1;
        for(int i =nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(0,nums.length-1,nums);
            return;
        }

        for(int j = nums.length-1;j>=0;j--){
            if(nums[j] >nums[index]){
                swap(index,j,nums);
                break;
            }
        }

        reverse(index+1,nums.length-1,nums);

    }

    public void swap(int left,int right,int[] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reverse(int left,int right,int[] nums){
        while(left<right){
            swap(left,right,nums);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.nextPermutation(new int[]{1,3,2});
    }
}

