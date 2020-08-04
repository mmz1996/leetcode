package question11_盛最多水的元素;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:28
 * @Created by mmz
 */
public class Mmz {
    public int maxArea(int[] height){
        int start = 0;
        int end = height.length-1;
        int max =Integer.MIN_VALUE;

        while(start<end){
            int temp = (end-start)*Math.min(height[start],height[end]);
            if(temp >max){
                max =temp;
            }
            if(height[start] > height[end]){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}
