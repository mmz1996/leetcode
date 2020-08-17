package question647_回文子串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 19:31
 * @Created by mmz
 */
public class Mmz {
    public static int countSubstrings(String s) {
        int start = 0;
        int end = s.length()-1;
        int count = 0;
        for(int i = 0;i<=end;++i){
            for(int j =i;j<=end+1;++j){
                System.out.println(s.substring(i,j));
                if(core(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean core(String s){
        if(s == null || s.length()<=0){
            return false;
        }
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        countSubstrings("aaa");
    }
}
