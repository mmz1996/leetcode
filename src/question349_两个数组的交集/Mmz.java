package question349_两个数组的交集;

import java.util.*;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 1:49
 * @Created by mmz
 */
public class Mmz {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        List<Integer> list =  new ArrayList<>();
        for(int i = 0 ;i<nums1.length;++i){
            set.add(nums1[i]);
        }

        for(int i = 0 ;i<nums2.length;++i){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0 ;i<list.size();++i){
            result[i] = list.get(i);
        }
        return result;
    }
}
