package jianzhi64_求12n的和;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 16:23
 * @Created by mmz
 */
public class Mmz {

    public int sumNums(int n) {
        boolean flag = n>0 && (n += sumNums(n-1))>0;
        return n;
    }
}
