package question371_两整数之和;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 22:16
 * @Created by mmz
 */
public class Mmz {
    public int getSum(int a, int b) {
        while(b != 0){
            int c = (a&b)<<1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
