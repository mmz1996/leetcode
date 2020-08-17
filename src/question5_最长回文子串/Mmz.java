package question5_最长回文子串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/17 23:21
 * @Created by mmz
 */
public class Mmz {
    public String longestPalindrome(String s) {
        if(s == null || s.length()<=0){
            return "";
        }
        int maxLength = 0;
        String result = "";
        for(int i =0;i<s.length();++i){
            String result1 = core(s,i,i);
            String result2 = core(s,i,i+1);

            String now = result1.length()>result2.length()?result1:result2;
            System.out.println(now);
            if(now.length() > maxLength){
                maxLength = now.length();
                result = now;
            }
        }
        return result;
    }

    public String core(String s,int left,int right){
        int l = left;
        int r = right;
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.longestPalindrome("babad");
    }

}
