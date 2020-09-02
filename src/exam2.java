/**
 * @Classname exam2
 * @Description TODO
 * @Date 2020/8/26 15:01
 * @Created by mmz
 */
public class exam2 {
    public boolean isStrsEqu (String str1, String str2) {
        // write code here
        if(str1.length() != str2.length()){
            return false;
        }
        if(str1.length() ==1 && str1.equals(str2)){
            return true;
        }else if(str1.length() == 1 && !str1.equals(str2)) {
            return false;
        }else{
            int length = str1.length();
            String first1 = str1.substring(0,length/2);
            String first2 = str1.substring(length/2);
            String second1 = str2.substring(0,length/2);
            String second2 = str2.substring(length/2);
            return (isStrsEqu(first1,second1) && isStrsEqu(first2,second2))||
                    (isStrsEqu(first1,second2) && isStrsEqu(first2,second1));
        }
    }

    public static void main(String[] args) {
        exam2 exam2 = new exam2();
        System.out.println(exam2.isStrsEqu("aaba","abaa"));
    }
}
