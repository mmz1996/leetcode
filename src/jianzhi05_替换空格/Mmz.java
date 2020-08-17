package jianzhi05_替换空格;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:32
 * @Created by mmz
 */
public class Mmz {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i<s.length();++i){
            if(s.charAt(i) != ' '){
                stringBuilder.append(s.charAt(i));
            }else{
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
    }
}
