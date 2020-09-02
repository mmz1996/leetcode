package jianzhi66_构建乘积数组;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 13:03
 * @Created by mmz
 */
public class Mmz1 {
    public int[] constructArr(int[] a) {
        if(a == null || a.length<=0){
            return new int[0];
        }

        int[] first = new int[a.length];
        int[] last = new int[a.length];

        first[0] = 1;
        for(int i = 1;i<a.length;++i){
            first[i] = first[i-1]*a[i];
        }

        last[a.length-1] = 1;
        for(int i = a.length-2;i>=0;--i){
            last[i] = last[i+1]*a[i];
        }

        int[] result = new int[a.length];

        for(int i = 0;i<a.length;++i){
           result[i] = first[i]*last[i];
        }
        return result;
    }
}
