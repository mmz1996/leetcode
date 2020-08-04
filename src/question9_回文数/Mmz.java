package question9_回文数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:25
 * @Created by mmz
 */
public class Mmz {
    public boolean isPalindrome(int x) {
        if(x <0 || (x%10 == 0 && x!= 0)){
            return false;
        }
        int reverse = 0;
        while(reverse<x){
            int temp = x%10;
            x =x/10;
            reverse = reverse*10+temp;
        }

        return (x == reverse)||(x == reverse/10);

    }
}
