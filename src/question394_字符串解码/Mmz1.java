package question394_字符串解码;


import java.util.Collections;
import java.util.LinkedList;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/4 12:09
 * @Created by mmz
 */
public class Mmz1 {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> linkedList = new LinkedList<>();

        ptr = 0;
        while(ptr <s.length()){
            if(Character.isDigit(s.charAt(ptr))){
                linkedList.addLast(getDigits(s));
            }else if(Character.isLetter(s.charAt(ptr)) || s.charAt(ptr) == '['){
                linkedList.addLast(String.valueOf(s.charAt(ptr++)));
            }else{
                ptr++;
                LinkedList<String> tmp = new LinkedList<>();
                while(!"[".equals(linkedList.peekLast())){
                    tmp.addLast(linkedList.pollLast());
                }

                Collections.reverse(tmp);
                linkedList.pollLast();

                int count = Integer.valueOf(linkedList.pollLast());
                StringBuffer stringBuffer = new StringBuffer();
                String o = getString(tmp);

                while(count-- >0){
                    stringBuffer.append(o);
                }

                linkedList.addLast(stringBuffer.toString());
            }
        }
        return getString(linkedList);
    }

    public String getString(LinkedList<String> linkedList){
        StringBuffer stringBuffer = new StringBuffer();
        for(String s:linkedList){
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }
    public String getDigits(String s){
        StringBuffer stringBuffer = new StringBuffer();
        while(Character.isDigit(s.charAt(ptr))){
            stringBuffer.append(s.charAt(ptr++));
        }

        return stringBuffer.toString();
    }


}
