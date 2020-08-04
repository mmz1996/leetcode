package question38_外观数列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/1 18:05
 * @Created by mmz
 */
public class Mmz {
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        StringBuffer res = new StringBuffer();
        String str = countAndSay(n-1);
        int length = str.length();
        int a = 0;
        for(int i =1;i<length+1;++i){
            if(i == length){
                return res.append(i-a).append(str.charAt(a)).toString();
            }else if(str.charAt(i) != str.charAt(a)){
                res.append(i-a).append(str.charAt(a));
                a = i;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
