package question415_字符串相加;


/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/16 16:57
 * @Created by mmz
 */
public class Mmz1 {
    public static String addStrings(String num1, String num2) {
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;
        StringBuffer stringBuffer = new StringBuffer();
        int flag = 0;
        while(length1>=0 || length2>=0){
            int x = length1>=0?num1.charAt(length1)-'0':0;
            int y = length2>=0?num2.charAt(length2)-'0':0;

            int result = x+y+flag;
            stringBuffer.append(result%10);
            flag = result/10;
            length1--;
            length2--;
        }

        if(flag == 1){
            stringBuffer.append("1");
        }
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        addStrings("9",
                "99");
    }
}
