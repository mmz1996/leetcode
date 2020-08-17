package question7_整数反转;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/8/17 23:53
 * @Created by mmz
 */
public class Mmz2 {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int temp = x%10;
            x = x/10;
            if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && temp > Integer.MAX_VALUE%10){
                return 0;
            }
            if(result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE/10 && temp < Integer.MIN_VALUE%10){
                return 0;
            }
            result = result*10+ temp;
        }
        return result;
    }
}
