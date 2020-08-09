package jianzhi58_反转单词顺序;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 20:43
 * @Created by mmz
 */
public class Mmz {
    public String reverseWords(String s) {
        //首位删除空格，形成一个字符串数组
        String[] strings = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = strings.length-1;i>=0;--i){
            if(strings[i].equals(" ")){
                continue;
            }
            stringBuilder.append(strings[i]+" ");
        }
        return stringBuilder.toString().trim();
    }
}
