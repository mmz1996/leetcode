package jianzhi58_反转单词顺序;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 17:27
 * @Created by mmz
 */
public class Mmz1 {
    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = strings.length-1;i>=0;--i){
            if(strings[i].equals(" ")){
                continue;
            }
            stringBuffer.append(strings[i]);
            stringBuffer.append(" ");
        }

        return stringBuffer.toString().trim();
    }
}
