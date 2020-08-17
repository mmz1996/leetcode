package question394_字符串解码;

import javax.sound.sampled.Line;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 12:21
 * @Created by mmz
 */
public class Mmz {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> linkedList = new LinkedList<>();
        ptr = 0;

        while(ptr<s.length()){
            char str = s.charAt(ptr);
            if(Character.isDigit(str)){
                String digit = getDigits(s);
                linkedList.add(digit);
            }else if(Character.isLetter(str) || str == '['){
                linkedList.addLast(String.valueOf(s.charAt(ptr++)));
            }else{
                ++ptr;
                LinkedList<String> sub =new LinkedList<>();
                while(!"[" .equals(linkedList.peekLast())){
                    sub.addLast(linkedList.pollLast());
                }
                Collections.reverse(sub);
                linkedList.pollLast();

                int counts = Integer.parseInt(linkedList.pollLast());
                StringBuffer stringBuffer = new StringBuffer();
                String o = getString(sub);

                while(counts-- >0){
                    stringBuffer.append(o);
                }
                linkedList.addLast(stringBuffer.toString());
            }

        }
        return getString(linkedList);
    }

    public String getDigits(String s){
        StringBuffer stringBuffer = new StringBuffer();
        while(Character.isDigit(s.charAt(ptr))){
            stringBuffer.append(s.charAt(ptr++));
        }
        return stringBuffer.toString();
    }

    public String getString(LinkedList<String> linkedList){
        StringBuffer stringBuffer = new StringBuffer();
        for(String s: linkedList){
            stringBuffer.append(s);
        }

        return stringBuffer.toString();
    }
}
