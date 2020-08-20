package question38_外观数列;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 0:33
 * @Created by mmz
 */
public class Mmz1 {
    public String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        StringBuffer stringBuffer = new StringBuffer();
        String string =  countAndSay(n-1);
        int length = string.length();
        int a = 0;
        for(int i =1;i<=length;++i){
            if(i == length){
                stringBuffer.append(i-a).append(string.charAt(a)).toString();
            }else if (string.charAt(i) != string.charAt(a)){
                stringBuffer.append(i-a).append(string.charAt(a));
                a = i;
            }

        }
        return stringBuffer.toString();
    }
}
