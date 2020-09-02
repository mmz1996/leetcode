package jianzhi31_栈的压入弹出序列;

import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/2 18:35
 * @Created by mmz
 */
public class Mmz {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int last = 0;
        while(count<=pushed.length-1){

            stack.push(pushed[count++]);

            while(!stack.isEmpty() &&  last<=popped.length-1  &&stack.peek() == popped[last]){
                stack.pop();
                last++;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}
