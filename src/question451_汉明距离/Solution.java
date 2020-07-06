package question451_汉明距离;

import sun.java2d.SurfaceDataProxy;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/6 23:09
 * @Created by mmz
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int count = 0;
        while(result != 0){
            if((result & 1) == 1){
                count ++;
            }
            result = result >> 1;
        }
        return count;
    }
}
