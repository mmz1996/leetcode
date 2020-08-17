package question455_分发饼干;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 1:43
 * @Created by mmz
 */
public class Mmz {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int startg = 0;
        int starts= 0;
        int count = 0;
        while(starts <s.length && startg<g.length){
            if(s[starts] >= g[startg]){
                count++;
                starts++;
                startg++;
            }else{
                starts++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        findContentChildren(new int[]{1,2,3} , new int[]{1,1});
    }
}
