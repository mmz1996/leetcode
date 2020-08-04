package question7_整数反转;

import com.sun.org.apache.xpath.internal.objects.XNull;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:19
 * @Created by mmz
 */
public class Mmz {
    public  static int reverse(int x) {
        int reverse = 0;

        while(x!=0){
            int temp = x%10;
            x /=10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && temp>7)){
                return 0;
            }
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && temp<-8)){
                return 0;
            }
            reverse = reverse*10+temp;
        }
        return reverse;
    }

    public static void main(String[] args) {
        reverse(123);
    }
}
