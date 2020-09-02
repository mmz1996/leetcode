package question56_合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 21:39
 * @Created by mmz
 */
public class Mmz1 {
    public int[][] merge(int[][] intervals){
        List<int[]> lists = new ArrayList<>();
        if(intervals == null || intervals.length<=0 || intervals[0].length<=0){
            return lists.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(o1, o2) -> o1[0] -o2[0]);

        int i = 0;
        while(i<intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];

            while(i+1<intervals.length && intervals[i+1][0] <=right){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }

            lists.add(new int[]{left,right});
            i++;
        }
        return lists.toArray(new int[0][]);
    }
}
