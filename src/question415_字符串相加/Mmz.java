package question415_字符串相加;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 12:40
 * @Created by mmz
 */
public class Mmz {
    public String addStrings(String num1, String num2) {
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;

        StringBuilder stringBuilder = new StringBuilder();

        int flag = 0 ;
        while(length1 != -1 && length2 != -1){
            int temp = (int)(num1.charAt(length1)+num2.charAt(length2))+flag-48*2;
            flag  = temp/10;
            temp = temp%10;
            stringBuilder.append(String.valueOf(temp));
            length1--;
            length2--;
        }
        if(length1 == -1 && length2 != -1){
            while(length2 != -1) {
                int temp = (int) (num2.charAt(length2)) + flag - 48;
                flag = temp / 10;
                temp = temp % 10;
                stringBuilder.append(String.valueOf(temp));
                length2--;
            }
        }else if(length2 == -1 && length1 != -1){
            while(length1 != -1) {
                int temp = (int) (num1.charAt(length1)) + flag - 48;
                flag = temp / 10;
                temp = temp % 10;
                stringBuilder.append(String.valueOf(temp));
                length1--;
            }
        }
        if(flag == 1){
            stringBuilder.append(String.valueOf(flag));
        }

        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args) {

        Mmz mmz = new Mmz();
        mmz.addStrings("9133",
                "0");
    }
}
