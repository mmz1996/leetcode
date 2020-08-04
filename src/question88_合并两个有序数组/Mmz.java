package question88_合并两个有序数组;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 1:43
 * @Created by mmz
 */
public class Mmz {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = m+n-1;
        m = m-1;
        n = n-1;
        while(m >=0 && n>=0){
            if(nums1[m] > nums2[n]){
                nums1[count--] = nums1[m--];
            }else{
                nums1[count--] = nums2[n--];
            }
        }
        if(m<0 && n>=0){
            nums1[count--] = nums2[n--];
        }else if(n<0 && m>=0){
            nums1[count--] = nums1[m--];
        }
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.merge(new int[]{4,5,6,0,0,0},3,new int[]{1,2,3},3);
    }
}
