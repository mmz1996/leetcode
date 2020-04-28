package question406_根据身高重建队列;

import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 18:22
 * @Created by mmz
 */
public class Solution {
    public static  int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        System.out.println(people.toString());
        List<int[]> output = new ArrayList<>();
        for(int[] p:people){
            output.add(p[1],p);
        }
        return output.toArray(new int[people.length][2]);
    }

}
