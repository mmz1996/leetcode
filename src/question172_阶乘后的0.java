/**
 * @Classname question172_阶乘后的0
 * @Description TODO
 * @Date 2020/9/27 22:24
 * @Created by mmz
 */
public class question172_阶乘后的0 {
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while(n>0){
            n /=5;
            zeroCount +=n;
        }
        return zeroCount;
    }
}
