package question155_最小栈;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 16:57
 * @Created by mmz
 */
public class Solution {
    class MinStack {
        public Stack<Integer> Stack1;
        public Stack<Integer> Stack2;
        /** initialize your data structure here. */
        public MinStack() {
            Stack1 = new Stack<>();
            Stack2 = new Stack<>();
        }

        public void push(int x) {
            if(Stack2.size() == 0){
                Stack1.push(x);
                Stack2.push(x);
            }else{
                if(Stack2.peek() >x){
                    Stack2.push(x);
                }else{
                    Stack2.push(Stack2.peek());
                }
                Stack1.push(x);
            }
        }

        public void pop() {
            Stack1.pop();
            Stack2.pop();
        }

        public int top() {
            return Stack1.peek();
        }

        public int getMin() {
            return Stack2.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
