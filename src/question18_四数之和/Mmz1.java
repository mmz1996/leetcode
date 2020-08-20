package question18_四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/20 13:49
 * @Created by mmz
 */
public class Mmz1 {
    static List<List<Integer>> lists  = new ArrayList<>();
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        if(nums == null || length<4){
            return lists;
        }
        Arrays.sort(nums);

        if(target<nums[0]+nums[1]+nums[2]+nums[3]){
            return lists;
        }
        if(target>nums[length-1]+nums[length-2]+nums[length-3]+nums[length-4]){
            return lists;
        }

        for(int i = 0;i<length-3;++i){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if(target<nums[i]+nums[i+1]+nums[i+2]+nums[i+3]){
                break;
            }
            if(target > nums[i] + nums[length-1] + nums[length-2] + nums[length-3]){
                continue;
            }

            for(int j = i+1;j<length-2 ;++j){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                if(target<nums[i] + nums[j] + nums[j+1] + nums[j+2]){
                    break;
                }
                if(target > nums[i] + nums[j] + nums[length-1] + nums[length-2]){
                    continue;
                }

                int l = j+1;
                int r = length-1;

                while(l<r){
                    int sum = nums[i]+ nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        lists.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                        l++;

                        while(l<r && nums[l-1] == nums[l]){
                            l++;
                        }
                        r--;
                        while (l<r && nums[r+1] == nums[r]){
                            r--;
                        }

                    }else if(sum <target){
                        l++;
                        while(l<r && nums[l] == nums[l-1]){
                            l++;
                        }
                    }else{
                        r--;
                        while(l<r && nums[r] == nums[r+1]){
                            r--;
                        }
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{0,0,0,0},
                0));
    }
}
