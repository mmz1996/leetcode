package question409_最长回文子串;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/16 17:29
 * @Created by mmz
 */
public class Mmz1 {
    public int longestPalindrome(String s) {
        int[] chars = new int[26];

        for(Character character :s.toCharArray()){
            chars[character]++;
        }

        int ans = 0;
        for(int i :chars){
            ans +=i/2*2;
            if(i % 2 ==1 && ans %2 ==0){
                ans++;
            }
        }
        return ans;
    }
}
