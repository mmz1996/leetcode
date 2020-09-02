package jianzhi65_不用加减法乘除做加法;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 16:32
 * @Created by mmz
 */
public class Mmz1 {
    public int add(int a, int b) {
        while(b!=0){
            int c = (a&b)<<1;
            a ^=b;
            b = c;
        }
        return a;
    }
}
