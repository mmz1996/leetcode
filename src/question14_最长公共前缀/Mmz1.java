package question14_最长公共前缀;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/18 20:38
 * @Created by mmz
 */
public class Mmz1 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length<=0){
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<strs[0].length();++i){
            for(int j = 1;j<strs.length;++j){
                if(j+1>=strs[0].length() && strs[j].charAt(i) != strs[0].charAt(i)){
                    return stringBuffer.toString();
                }

            }
            stringBuffer.append(strs[0].charAt(i));
        }
        return stringBuffer.toString();
    }
}
