package question135_分发糖果;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/29 1:46
 * @Created by mmz
 */
public class Mmz {
    public int candy(int[] ratings) {
        if(ratings == null){
            return 0;
        }
        int[] result = new int[ratings.length];
        Arrays.fill(result,1);
        boolean flag = true;
        int sum = 0;
        while(flag){
            flag = false;
            for(int i =0;i<ratings.length;++i){
                if(i != ratings.length-1 && ratings[i] > ratings[i+1] && result[i] <=result[i+1]){
                    result[i]  = result[i+1]+1;
                    flag = true;
                }

                if(i>0 && ratings[i] >ratings[i-1] && result[i] <=result[i-1]){
                    result[i] =result[i-1]+1;
                    flag = true;
                }
            }
        }

        for(int candy:result ){
            sum +=candy;
        }

        return sum;
    }
}
