package jianzhi09_用两个栈实现队列;

import java.util.Stack;

/**
 * @Classname CQueue
 * @Description TODO
 * @Date 2020/8/12 22:56
 * @Created by mmz
 */
public class CQueue {
        Stack<Integer> in ;
        Stack<Integer> out ;
    public CQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void appendTail(int value) {
        in.add(value);
    }

    public int deleteHead() {
        if(out.size() == 0){
            if(in.size() == 0){
                return -1;
            }else{
                while(in.size() !=9){
                    out.add(in.peek());
                }
                return in.peek();
            }
        }else{
            return out.peek();
        }
    }
}
