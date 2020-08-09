package question409_最长回文子串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 12:33
 * @Created by mmz
 */
public class Mmz {
    public int longestPalindrome(String s) {
        int[] chars = new int[128];
        int ans = 0;

        for(char c:s.toCharArray()){
            chars[c]++;
        }

        for(int v :chars){
            ans += v/2*2;
            if(v % 2 == 1 && ans %2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
