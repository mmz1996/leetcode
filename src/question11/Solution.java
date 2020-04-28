package question11;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/1 20:40
 * @Created by mmz
 */
public class Solution {
        public int maxArea(int[] height) {
            int maxarea = 0 ;
            for(int i = 0 ;i<height.length;++i){
                for(int j = i+1;j<height.length;++j){
                    System.out.println(i);
                    System.out.println(j);
                    maxarea = Math.max(maxarea,Math.min(height[i],height[j])*(j-i));
                }
            }
            return maxarea;
        }

    public static void main(String[] args) {
        Solution solutionn = new Solution();
        System.out.println(solutionn.maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }
}
