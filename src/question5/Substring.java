package question5;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @Classname Substring
 * @Description TODO
 * @Date 2020/4/1 18:31
 * @Created by mmz
 */
public class Substring {
   static String longestPalindrome(String string){
       int start=0,end=0;

       for(int i = 0 ;i<string.length();++i){
           int len1 = getLength(string,i,i);
           int len2 = getLength(string,i,i+1);
           int len = Math.max(len1,len2);
           if(len > end-start){
               start = i-(len-1)/2;
               end = i+len/2;
           }
       }
       System.out.println();
       return string.substring(start,end+1);
   }

   static Integer getLength(String string ,int i,int j){
       int Left = i,Right =j;
       while(Left >=0 && Right <string.length() && string.charAt(Left) == string.charAt(Right)){
           Left--;
           Right++;
       }
       return  Right - Left -1;
   }
    public static void main(String[] args) {
        String string ="abcba";
        System.out.println(string.substring(1,5));

        System.out.println(longestPalindrome(string));
    }
}
