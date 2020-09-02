package question50_power;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 10:20
 * @Created by mmz
 */
public class Mmz {
    public double myPow(double x, int n) {
        if(x == 1 || n== 0){
            return 1;
        }
        long N = n;
        if(n<0){
            return 1/core(x,-N);
        }

        return core(x,N);

    }

    public double core(double x, Long n ){
        if(n == 1){
            return x;
        }

        if(n % 2 == 0){
            double half = core(x,n/2);
            return half*half;
        }else{

            double half = core(x,n/2);
            return half*half*x;
        }
    }
}
