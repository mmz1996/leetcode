package question22_括号生成;

import java.util.Stack;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/10/12 14:14
 * @Created by mmz
 */
public class Mmz1 {
        public boolean isValid(String s) {
            if (s == null || s.length() <= 0) {
                return false;
            }

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (!stack.isEmpty() && (s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{') || (s.charAt(i) == ']' && stack.peek() == '[')) {
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {
        Mmz1 mmz1 = new Mmz1();
        mmz1.isValid("]");
    }
}
