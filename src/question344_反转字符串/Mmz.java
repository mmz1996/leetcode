package question344_反转字符串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 21:48
 * @Created by mmz
 */
public class Mmz {
    public void reverseString(char[] s) {
        int length = s.length;
        int start = 0;
        int end = length-1;

        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }

    }
}
