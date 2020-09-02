package jianzhi49_丑数;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 16:33
 * @Created by mmz
 */
public class Mmz1 {
    public int nthUglyNumber(int n) {
        if(n < 0){
            return -1;
        }
        int[] result = new int[n];
        result[0] =1;
        int t2 = 0,t3= 0,t5=0;

        for(int i = 1;i<n;++i){
            result[i] = Math.min(result[t2]*2,Math.min(result[t3]*3,result[t5]*5));

            if(result[i] %2 ==0){
                t2++;
            }
            if(result[i] % 3==0){
                t3++;
            }
            if(result[i] % 5 == 0){
                t5++;
            }
        }

        return result[n-1];
    }
}
