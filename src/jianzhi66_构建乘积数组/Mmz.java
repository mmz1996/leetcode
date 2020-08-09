package jianzhi66_构建乘积数组;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 17:56
 * @Created by mmz
 */
public class Mmz {
    public int[] constructArr(int[] a) {
        if(a == null || a.length <=0){
            return new int[0];
        }
        int[] first = new int[a.length];
        int[] last = new int[a.length];
        first[0] = 1;
        last[a.length-1] = 1;
        for(int i = 1;i<a.length;++i){
            first[i] = first[i-1] * a[i-1];
        }
        for(int i = a.length-2;i>=0;--i){
            last[i] = last[i+1]* a[i+1];
        }

        int result[] = new int[a.length];
        for(int i = 0;i<result.length;++i){
            result[i] = first[i] * last[i];
        }
        return result;
    }
}
