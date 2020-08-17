package jianzhi15_二进制中1的个数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:29
 * @Created by mmz
 */
public class Mmz {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            if((n & 1) ==1 ){
                count++;
            }
            n = n >>1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 16;
        n = n>>1;
        System.out.println(n);
        int m = 16;
        m >>>= 1;
        System.out.println(m);
    }
}
