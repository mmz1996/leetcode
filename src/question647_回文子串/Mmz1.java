package question647_回文子串;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/15 19:49
 * @Created by mmz
 */
public class Mmz1 {
    public static int countSubstrings(String s) {
        int length = s.length();
        int result = 0;

        for(int i =0;i<=length*2-1;++i){
            int left = i/2;
            int right = left+i%2;

            while(left>=0 && right<length && s.charAt(left) == s.charAt(right)){
                result++;
                left--;
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
