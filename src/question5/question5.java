package question5;

/**
 * @Classname question5.question5
 * @Description TODO
 * @Date 2020/4/1 17:23
 * @Created by mmz
 */
public class question5 {
    public String longestPalindrome(String s) {
        if(s ==  "" || s.length()<=0){
            return "";
        }
        int curlength = 0,maxlength = 0,index = 0;
        for(int i = 0 ;i<s.length();++i){
            curlength = getCurLength(s,i,0,s.length());
            if(curlength >maxlength){
                maxlength = curlength;
                index = i ;
            }
        }
        if(maxlength%2 == 0){
            System.out.println(index);
            System.out.println(maxlength);
            if(index+maxlength/2 == s.length()-1){
                return s.substring(index-maxlength/2+1);
            }
            return  s.substring(index-maxlength/2+1,index+maxlength/2+1);
        }else{
            System.out.println(index);
            System.out.println(maxlength);
            if(index+maxlength/2 == s.length()-1){
                return s.substring(index-maxlength/2);
            }
            return  s.substring(index-maxlength/2,index+maxlength/2+1);
        }
    }
    public int getCurLength(String string,int index,int start,int end) {
        int count = 1;
        int indexnow = index;
        int indexpre = index - 1;
        int indexnext = index + 1;
        int first = 1;
        int second = 1;
        if (indexpre >= 0 && indexnext < string.length() && string.charAt(indexpre) == string.charAt(indexnext)) {
            while (indexpre >= 0 && indexnext < string.length() && string.charAt(indexpre) == string.charAt(indexnext)) {
                count = count + 2;
                indexpre = indexpre - 1;
                indexnext = indexnext + 1;
            }
            first = count;
        }
        count = 1;
        indexnow = index;
        indexpre = index - 1;
        indexnext = index + 1;
        if (indexnow >= 0 && indexnext < string.length() && string.charAt(indexnow) == string.charAt(indexnext)) {
            while (indexnow >= 0 && indexnext < string.length() && string.charAt(indexnow) == string.charAt(indexnext)) {
                count = count + 2;
                indexnow = indexnow - 1;
                indexnext = indexnext + 1;
            }
            second =  count - 1;
        }

        return Math.max(first,second);
    }


}
