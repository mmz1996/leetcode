package question56_合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 18:55
 * @Created by mmz
 */
public class Mmz {
    public int[][] merge(int[][] intervals) {
        List<int[]> lists = new ArrayList<>();
        if(intervals.length == 0|| intervals == null){
            return lists.toArray(new int[0][]);
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        while(i<intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i<intervals.length-1 && intervals[i+1][0] <=right){
                i++;
                right = Math.max(right,intervals[i][1]);
            }
            lists.add(new int[]{left,right});
            i++;
        }
        return lists.toArray(new int[0][]);
    }
}
