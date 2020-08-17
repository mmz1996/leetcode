package question406_根据身高重建队列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 17:33
 * @Created by mmz
 */
public class Mmz {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0]?o1[0]-o2[0]:o2[1]-o1[1];
            }
        });

        List<int[]> list = new ArrayList<>();
        for(int[] p :people){
            list.add(p[1],p);
        }

        return list.toArray(new int[people.length][2]);
    }
}
