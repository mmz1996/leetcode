package question11;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/4/1 21:00
 * @Created by mmz
 */
public class Solution1 {
    public static int maxArea(int[] height){
        int i = 0;
        int j = height.length-1;
        int max = (j-i)*Math.min(height[i],height[j]);

        while(i<j){
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
