package jianzhi49_丑数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 18:47
 * @Created by mmz
 */
public class Mmz {
    public int nthUglyNumber(int n) {
        int[] result = new int[n];

        int t2=0,t3=0,t5=0;
        result[0] = 1;

        for(int i = 1;i<n;++i){
            result[i] = Math.min(2*result[t2],Math.min(3*result[t3],5*result[t5]));

            if(result[i] % 2== 0){
                t2++;
            }
            if(result[i] % 3 == 0){
                t3++;
            }
            if(result[i] % 5 == 0){
                t5++;
            }
        }
        return result[n-1];
    }
}
