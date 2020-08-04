package question11;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:09
 * @Created by mmz
 */
public class Mmz {
    public String longestPalindrome(String s) {
        if(s == null || s.length()<1){
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0 ;i<s.length();++i){
            int len1 = Core(s,i,i);
            int len2 = Core(s,i,i+1);
            int len = Math.max(len1,len2);

            if(len > end-start+1){
                start = i-(len-1)/2;
                end = i+(len)/2;
            }
        }
        return s.substring(start,end+1);
    }

    public int Core(String s ,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
