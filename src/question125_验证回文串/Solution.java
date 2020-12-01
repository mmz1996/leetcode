package question125_验证回文串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/15 16:13
 * @Created by mmz
 */
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() <= 0){
            return true;
        }

        s= s.toLowerCase();

        int first = 0;
        int last = s.length()-1;

        while(first<=last){
            while(!((s.charAt(first) >= 'a' && s.charAt(first) <='z') || (s.charAt(first) >= '0' && s.charAt(first) <= '9'))){
                first++;
                if(first>last){
                    break;
                }
            }
            while(!((s.charAt(last) >= 'a' && s.charAt(last) <='z') || (s.charAt(last) >= '0' && s.charAt(last) <= '9'))){
                last--;
                if(first>last){
                    break;
                }
            }

            if(s.charAt(first) == s.charAt(last)){
                first++;
                last--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }
}

