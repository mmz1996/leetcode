package jianzhi16_数值的整次方;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 1:47
 * @Created by mmz
 */
public class Mmz {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1){
            return 1.0;
        }
        long b = n;
        if(b <0){
            return 1/Core(x,-b);
        }else{
            return Core(x,b);
        }
    }

    public double Core(double x,Long n){
        double result = 1.0;
        while(n != 0){
            if((n & 1) == 1){
                result *=x;
            }
            x *=x;
            n >>=1;
        }
        return result;
    }
}
