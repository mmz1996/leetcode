package question14_最长公共前缀;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:48
 * @Created by mmz
 */
public class Mmz {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null|| strs.length<1){
            return "";
        }
        int length = strs.length;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<strs[0].length();++i){
            for(int j = 1;j<length;++j){
                if(strs[j].length()<i+1 || strs[0].charAt(i) != strs[j].charAt(i)){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(strs[0].charAt(i));
        }
        return stringBuilder.toString();
    }
}
