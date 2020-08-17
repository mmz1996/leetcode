package question575_分糖果;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 20:16
 * @Created by mmz
 */
public class Mmz {
    public static int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for(int i = 1;i<candies.length && count <candies.length/2;++i){
            if(candies[i] == candies[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 2, 3}));
    }

}
