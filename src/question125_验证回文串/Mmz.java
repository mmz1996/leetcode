package question125_验证回文串;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 2:29
 * @Created by mmz
 */
public class Mmz {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase();
        System.out.print(s);
        while(start<=end){
            while(!((s.charAt(start) >= 'a' && s.charAt(start) <='z') || (s.charAt(start) >= '0' && s.charAt(start) <= '9'))){
                start++;
                if(start>end){
                    break;
                }
            }
            while(!((s.charAt(end) >= 'a' && s.charAt(end) <='z') || (s.charAt(end) >= '0' && s.charAt(end) <= '9'))){
                end--;
                if(start>end){
                    break;
                }
            }
            if(start<=end &&  s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.isPalindrome("0P"));
    }
}
