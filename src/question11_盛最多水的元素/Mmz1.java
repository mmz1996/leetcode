package question11_盛最多水的元素;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/18 0:13
 * @Created by mmz
 */
public class Mmz1 {
    public int maxArea(int[] height) {
        if(height == null || height.length <=0){
            return 0;
        }

        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int now = (right-left)*Math.min(height[left],height[right]);
            if(now >max){
                max = now;
            }
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}
