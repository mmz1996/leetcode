package question402_移掉k位数字;

import java.util.LinkedList;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/4 11:54
 * @Created by mmz
 */
public class Mmz1 {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> linkedList = new LinkedList<>();

        for(Character character :num.toCharArray()){
            while(linkedList.size()>0 && k>0 && linkedList.peekLast()>character){
                linkedList.pollLast();
                k = k =1;
            }

            linkedList.addLast(character);
        }

        for (int i =0;i<k;++i){
            linkedList.pollLast();
        }

        boolean flag = true;
        StringBuffer stringBuffer = new StringBuffer();
        for(Character character :linkedList){
            if(flag  && character == '0'){
                continue;
            }
            flag = false;
            stringBuffer.append(character);
        }


        if(stringBuffer.length() ==0){
            return "0";
        }

        return stringBuffer.toString();
    }
}
