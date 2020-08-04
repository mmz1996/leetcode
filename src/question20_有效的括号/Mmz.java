package question20_有效的括号;

import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 23:39
 * @Created by mmz
 */
public class Mmz {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<chars.length;++i){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if((stack.size()!=0 &&s.charAt(i) ==')' && stack.peek() == '(') || (stack.size()!=0 &&s.charAt(i) ==']' && stack.peek() == '[') ||(stack.size()!=0 &&s.charAt(i) =='}' && stack.peek() == '{')){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {

        Mmz mmz = new Mmz();
        System.out.println(mmz.isValid("]"));
    }
}
