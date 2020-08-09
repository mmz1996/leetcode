package jianzhi58_左旋字符串;

import javax.management.StringValueExp;
import javax.management.ValueExp;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 20:34
 * @Created by mmz
 */
public class Mmz {
    public String reverseLeftWords(String s, int n) {
        char[] charold = s.toCharArray();
        char[] charnew = new char[s.length()];
        int index = 0;
        for(int i = n ;i<s.length();++i){
            charnew[index++] = charold[i];
        }
        for(int i = 0;i<n;++i){
            charnew[index++] = charold[i];
        }

        return String.valueOf(charnew);
    }
}
