package question9_回文数;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/17 23:57
 * @Created by mmz
 */
public class Mmz1 {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x!=0)){
            return false;
        }
        if(x == 0){
            return true;
        }

        int reverse = 0;
        while(reverse<x){
            int temp = x%10;
            x = x/10;
            reverse = reverse*10+temp;
        }

        return (reverse == x) || (reverse/10 == x);


    }
}
