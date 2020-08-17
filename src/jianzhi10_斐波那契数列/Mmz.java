package jianzhi10_斐波那契数列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:04
 * @Created by mmz
 */
public class Mmz {
    public int fib(int n) {
        if(n <=0 ){
            return 0;
        }
        if(n ==1 ){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int f1 = 1;
        int f2 = 1;
        for(int i =3 ;i<n;++n){
            int temp = f1+f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }
}
