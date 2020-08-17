package question402_移掉k位数字;

import java.util.LinkedList;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 18:49
 * @Created by mmz
 */
public class Mmz {

    public static String removeKdigits(String num, int k) {
        LinkedList<Character> linkedList = new LinkedList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(Character character :num.toCharArray()){
            while(linkedList.size() >0 &&k>0 &&linkedList.peekLast()>character){
                linkedList.pollLast();
                k = k-1;
            }
            linkedList.addLast(character);
        }


        for(int i = 0;i<k;i++){
            linkedList.pollLast();
        }


        boolean flag = true;
        for(Character character :linkedList){
            if(flag == true && character == '0'){
                continue;
            }
            flag = false;
            stringBuffer.append(character);
        }

        if(stringBuffer.length() == 0){
            return "0";
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        removeKdigits("1432219",
                3);
    }

}
